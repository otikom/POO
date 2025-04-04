/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Patient {
     private int id; 
     private Team team;
     private Ward ward;
     private ArrayList<Appointment> appointments;
     private ArrayList<Doctor> doctors;

    public Patient(int id, Team team, Ward ward, ArrayList<Appointment> appointments, ArrayList<Doctor> doctors) {
        this.id = id;
        this.team = team;
        this.ward = ward;
        this.appointments = appointments;
        this.doctors = doctors;
    }
     
}
