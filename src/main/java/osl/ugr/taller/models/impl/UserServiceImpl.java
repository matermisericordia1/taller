/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osl.ugr.taller.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import osl.ugr.taller.models.dao.UserDAO;
import osl.ugr.taller.models.entity.User;
import osl.ugr.taller.models.service.IUserService;

/**
 *
 * @author rostro
 */

@Service
public class UserServiceImpl implements IUserService{
    
    @Autowired
    private UserDAO userDao;

    @Override
    public User finByUsername(String username) {
        return userDao.finByUsername(username);
    }
    
    
}
