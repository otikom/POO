/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Doctor.ConsultantDoctor;
import Doctor.Doctor;
import Doctor.JuniorDoctor;
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

    public Team(int id) {
        this.id = id;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();

    }

    public void addJuniorDoctor(int id) {
        doctors.add(new JuniorDoctor(id));
    }

    public void createConsultant(int id) {
        this.teamLeader = new ConsultantDoctor(id);
        teamLeader.setLeaderOf(this);
    }

    public boolean addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public Doctor getDoctor(int idDoctor) {
        for(Doctor doctor:doctors){
            if(doctor.getId()==idDoctor){
                return doctor;
            }
        }
        return null;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

}
