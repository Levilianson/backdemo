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
@Setter @Getter
@Entity
public class Educacion {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idEdu;
   private String tituloEdu;
   private int fechaEdu;
   private String descEdu;
   private String imagenEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, int fechaEdu, String descEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu= descEdu;
        this.imagenEdu = imagenEdu;
    }  
}
