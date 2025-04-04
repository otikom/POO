/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Doctor.Doctor;

/**
 *
 * @author Alexander Sanguino
 */
public class Appointment {
    private Doctor doctor;
    private Patient patient;
    static Appointment crearAppointment(Doctor doctor,Patient patient){
        return new Appointment(doctor,patient);
    }

    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }
    
}
