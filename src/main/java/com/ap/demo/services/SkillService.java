/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.demo.services;

import com.ap.demo.model.Skill;
import com.ap.demo.repository.SkillRepo;
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
public class SkillService {
    private final SkillRepo skillRepo;
    
    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }
    public Skill addEducacion(Skill skill){
        return skillRepo.save(skill);
    }
    public List<Skill> buscarSkilles(){
        return skillRepo.findAll();
    }
    public Skill editarSkill(Skill skill){
        return skillRepo.save(skill);
    }
    public void borrarSkill(Long id){
        skillRepo.deleteById(id);
    }
}
