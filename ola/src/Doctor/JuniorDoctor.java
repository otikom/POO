/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Core.Patient;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class JuniorDoctor extends Doctor {
    
    public JuniorDoctor(int id){
        super(id);
        this.apointments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    @Override
    public boolean addPatient(Patient patient){
        if(!patients.contains(patient)){
            patients.add(patient);
            return true;
        }
        return false;
    }

    @Override
    public int getId() {
        return id;
    }
}
