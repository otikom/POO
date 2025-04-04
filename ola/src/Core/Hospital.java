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
    public Team getTeam(int idTeam){
        for(Team team:teams){
            if(team.getId()==idTeam){
                return team;
            }
        }
        return null;
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
    public Ward getWard(int idWard){
        for(Ward ward:wards){
            if(ward.getId()==idWard){
                return ward;
            }
        }
        return null;
    }
    public void numberDoctorsPatient(){
        for(Ward ward:wards){
            for(Patient patient:ward.getPatients()){
                int n= patient.getDoctors().size();
                System.out.println("Patient "+patient.getId()+" has "+n+" doctors");
            }
        }
    }
    public void numberPatientsTeam(){
        for(Team team:teams){
                int n= team.getPatients().size();
                System.out.println("Team "+team.getId()+" has "+n+" patients");
            
        }
    }
 
    public void relationAppoiments(){
       int c=0;
        for(Ward ward:wards){
            for(Patient patient:ward.getPatients()){
                ArrayList<Appointment> sitas = patient.getAppointments();
                    c=sitas.size();                    
                System.out.println("Patient "+patient.getId()+" has "+c+" appointments ");
                for(Appointment appointment:sitas){
                    System.out.println("Patient "+patient.getId()+" has an "+" appointment with the doctor "+appointment.geDoctor().getId());
                }
                }            
        }
    }
}
