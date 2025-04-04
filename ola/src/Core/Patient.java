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
     
    static Patient crearPatient(int id,Team team,Ward ward){
        return new Patient(id,team,ward);
    }
    public Patient(int id,Team team,Ward ward) {
        this.id = id;
        this.team=team;
        this.ward=ward;
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }
    public ArrayList<Appointment> getAppointments(){
        return appointments;
    }
    public Team getTeam() {
        return team;
    }
        public boolean addDoctor(Doctor doctor){
        if(!doctors.contains(doctor)){
            doctors.add(doctor);
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
        
}
