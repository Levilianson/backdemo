/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.demo.Seguridad;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author omari
 */
@Setter @Getter
public class AuthResponse {
   private String email;
   private String accessToken;

    public AuthResponse() {
    }

    public AuthResponse(String email, String accessToken) {
        this.email = email;
        this.accessToken = accessToken;
    }
   
   
}
