/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.demo.services;

import com.ap.demo.Exeption.UserNotFoundException;
import com.ap.demo.model.Usuario;
import com.ap.demo.repository.EducacionRepo;
import com.ap.demo.repository.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author omari
 */
@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;
    
    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }
    public Usuario addExperiencia(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public List<Usuario>buscarUsuarios(){
        return usuarioRepo.findAll();
    }
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario fail"));
    }
}
