/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package osl.ugr.taller.models.service;

import osl.ugr.taller.models.entity.User;

/**
 *
 * @author rostro
 */
public interface IUserService {
    
    public User finByUsername(String username);
}
