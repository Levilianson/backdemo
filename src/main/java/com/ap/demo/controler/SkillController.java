/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.demo.controler;

import com.ap.demo.model.Skill;
import com.ap.demo.services.SkillService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omari
 */
@RestController
@RequestMapping("/Skills")
public class SkillController {
    private final SkillService skillService;
    
    public SkillController(SkillService skillService){
        this.skillService = skillService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Skill>>obtenerSkill(){
        List<Skill> skilles = skillService.buscarSkilles();
        return new ResponseEntity<>(skilles, HttpStatus.OK);
    }
    
}
