/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osl.ugr.taller.repository;

import osl.ugr.taller.models.entity.Pc;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rostro
 */
public interface PcRepository extends JpaRepository<Pc, Long> {
    
}
