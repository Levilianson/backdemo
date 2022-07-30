/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author omari
 */
@Getter @Setter
@Entity
public class Experiencia {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idExp;
   private String tituloExp;
   private int fechaExp;
   private String descExp;
   private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, int fechaExp, String descExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp= descExp;
        this.imagenExp = imagenExp;
    }  
}
