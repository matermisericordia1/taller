/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osl.ugr.taller.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import osl.ugr.taller.models.entity.User;

/**
 *
 * @author rostro
 */

@Repository
public interface UserDAO extends JpaRepository<User, Long>{
    
    public User finByUsername(String username);
}
