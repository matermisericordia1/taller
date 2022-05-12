/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osl.ugr.taller.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import osl.ugr.taller.models.entity.User;
import osl.ugr.taller.models.service.IUserService;
import osl.ugr.taller.models.dao.IUserDAO;

/**
 *
 * @author rostro
 */

@Service
public class UserServiceImpl implements IUserService{
    
    @Autowired
    private IUserDAO userDao;
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public User finByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User logup(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userDao.save(user);
    }
    
    
    
}
