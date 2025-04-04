/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Ward {
    private int id;
    private ArrayList<Patient> patients;

    public Ward(int id) {
        this.id=id;
        this.patients = new ArrayList<>();
    }
    
    public boolean addPatient(Patient patient){
        if(!patients.contains(patient)){
            patients.add(patient);
            return true;
        }
        return false;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public int getId() {
        return id;
    }
    
}
