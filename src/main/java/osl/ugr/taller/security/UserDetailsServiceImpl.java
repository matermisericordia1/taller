/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osl.ugr.taller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import osl.ugr.taller.models.dao.IUserDAO;
import osl.ugr.taller.models.entity.User;

/**
 *
 * @author rostro
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private IUserDAO userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User user = userDao.findByUsername(username);
        org.springframework.security.core.userdetails.User.UserBuilder builder = null;
        
        if(user!=null) {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.disabled(false);
            builder.password(user.getPassword());
            builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
            
        } 
        else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return builder.build();
    }
    
}
