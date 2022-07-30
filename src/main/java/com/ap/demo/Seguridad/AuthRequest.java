/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.demo.Seguridad;

import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author omari
 */
@Getter @Setter
public class AuthRequest {
   @Email
   @Length(min=3, max=50)
   private String email;
   @Length(min=3, max=50)
   private String password;
}
