/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Core.Appointment;
import Core.Patient;
import Core.Team;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public abstract class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList<Appointment> apointments;
    protected ArrayList<Patient> patients;

    public Doctor(int id){
        this.id=id;
        this.apointments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public boolean addPatient(Patient patient){
        if(!patients.contains(patient)){
            patients.add(patient);
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }
    public ArrayList<Appointment> getAppointments() {
        return apointments;
    }
    
}
