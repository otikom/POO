/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Doctor.ConsultantDoctor;
import Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Team {
    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Team(int id, ConsultantDoctor teamLeader, ArrayList<Doctor> doctors, ArrayList<Patient> patients) {
        this.id = id;
        this.teamLeader = teamLeader;
        this.doctors = doctors;
        this.patients = patients;
    }
    
}
