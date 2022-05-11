/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osl.ugr.taller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import osl.ugr.taller.repository.PcRepository;

/**
 *
 * @author rostro
 */

@Controller
public class PcController{
    
    @Autowired
    PcRepository pcRepository;
    
    @RequestMapping("/pc")
    public String pc(Model model) {
        model.addAttribute("pcs", pcRepository.findAll());
        return "pc";
    }
    
    
   
}
