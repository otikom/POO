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
public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }
    public void addJuniorDoctor(Team team,int id){
        team.addJuniorDoctor(id);
    }
    public void addTeam(int idTeam, int idConsultant){
        Team nteam = new Team(idTeam);
        nteam.createConsultant(idConsultant);
        teams.add(nteam);
    }
     public void addWard(int idWard){
        wards.add(new Ward(idWard));
    }
      public void addPatient(Ward ward, Team team, int idPatient){
        Patient patient=Patient.crearPatient(idPatient,team,ward);
        ward.addPatient(patient);
        team.addPatient(patient);                 
    }
      public void assignPatientDoctor(Patient patient,int idDoctor){
          Team pteam=patient.getTeam();
          Doctor doctor=pteam.getDoctor(pteam.getId()+idDoctor);
          doctor.addPatient(patient);
          patient.addDoctor(doctor);
      }
      public void assignAppoiment(Patient patient,int idDoctor){
          Team pteam=patient.getTeam();
          Doctor doctor=pteam.getDoctor(pteam.getId()+idDoctor);
          Appointment appointment= Appointment.crearAppointment(doctor, patient);
      }
    public Team getTeam(int index){
        return teams.get(index);
    }
    public Patient getPatient(int id){
        for(Ward ward:wards){
            for(Patient patient:ward.getPatients()){
                if(patient.getId()==id){
                    return patient;
                }
            }
        }
        return null;
    }
    public Ward getWard(int index){
        return wards.get(index);
    }
}
