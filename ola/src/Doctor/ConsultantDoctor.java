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
public class ConsultantDoctor extends Doctor {
    private Team leaderOf;

    public ConsultantDoctor(int id) {
        super(id);
    }

    public void setLeaderOf(Team leaderOf) {
        this.leaderOf = leaderOf;
    }
 
    
}
