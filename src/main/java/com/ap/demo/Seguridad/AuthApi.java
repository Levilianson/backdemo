/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.demo.Seguridad;

import com.ap.demo.Seguridad.jwt.JwtTokenUtil;
import com.ap.demo.model.User;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omari
 */
@RestController
public class AuthApi {
    @Autowired
    AuthenticationManager authManager;
    
    @Autowired
    JwtTokenUtil jwtTokeUtil;
    
    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthRequest request){
    try {
        Authentication authentication = authManager.authenticate(
            new UsernamePasswordAuthenticationToken( request.getEmail(),request.getPassword()));
        
        User user = (User) authentication.getPrincipal();
        String accessToken = jwtTokeUtil.generateAccessToken(user);
        AuthResponse response = new AuthResponse(user.getEmail(), accessToken);
        
        return ResponseEntity.ok().body(response);
    }catch (BadCredentialsException ex){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
