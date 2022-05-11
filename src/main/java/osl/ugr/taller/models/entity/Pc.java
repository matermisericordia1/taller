/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osl.ugr.taller.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author rostro
 */

@Entity
public class Pc {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String pcCode;
    private String pcRam;
    private String pcHdd;
    private String pcTower;
    private String pcProcessor;


    public Pc() {
    }

    public Pc(String id, String pcCode, String pcRam, String pcHdd, String pcTower, String pcProcessor) {
        this.id = id;
        this.pcCode = pcCode;
        this.pcRam = pcRam;
        this.pcHdd = pcHdd;
        this.pcTower = pcTower;
        this.pcProcessor = pcProcessor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPcCode() {
        return pcCode;
    }

    public void setPcCode(String pcCode) {
        this.pcCode = pcCode;
    }

    public String getPcRam() {
        return pcRam;
    }

    public void setPcRam(String pcRam) {
        this.pcRam = pcRam;
    }

    public String getPcHdd() {
        return pcHdd;
    }

    public void setPcHdd(String pcHdd) {
        this.pcHdd = pcHdd;
    }

    public String getPcTower() {
        return pcTower;
    }

    public void setPcTower(String pcTower) {
        this.pcTower = pcTower;
    }

    public String getPcProcessor() {
        return pcProcessor;
    }

    public void setPcProcessor(String pcProcessor) {
        this.pcProcessor = pcProcessor;
    }

    
}
