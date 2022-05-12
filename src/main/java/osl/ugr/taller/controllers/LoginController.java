/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package osl.ugr.taller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import osl.ugr.taller.models.entity.User;
import osl.ugr.taller.models.service.IUserService;

/**
 *
 * @author rostro
 */

@Controller
public class LoginController {
    
    @Autowired
    private IUserService userService;
    
    @GetMapping("/auth/logup")
    public String logupForm(Model model) {
        model.addAttribute("user", new User());
        return "auth/logup";
    }
    
    @PostMapping("/auth/logup")
    public String logup(@Validated @ModelAttribute User user, BindingResult result, Model model) {
        
        if (result.hasErrors()) {
            return "redirect:/auth/logup";
        } 
        else {
            model.addAttribute("user", userService.logup(user));
        }
        
        return "redirect:/auth/login";
    }
    
    
    
}
