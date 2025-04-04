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
    protected Patient patients;

    public Doctor() {
    }
    
    
    
    
}
