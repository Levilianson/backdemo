/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.demo.repository;

import com.ap.demo.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author omari
 */
public interface SkillRepo extends JpaRepository<Skill, Long> {
    
}
