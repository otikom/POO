/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Cliente;
import core.persona.Instructor;
import core.producto.Curso;
import core.producto.Plan;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Clatzy {
    private ArrayList<Instructor> instructores;
     private ArrayList<Plan> planes;
     private ArrayList<Curso> cursos;
     private ArrayList<Cliente> clientes;

    public Clatzy() {
        this.instructores = new ArrayList<>();
        this.planes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
     public void addInstructor(String nombre, String cedula, String telefono, String email){
        instructores.add(new Instructor(nombre,cedula,telefono,email));
    }  
    public void addCurso(int idCurso, String nombre, LocalDate fecha, float valor,Instructor instructor ){
        cursos.add(new Curso(idCurso,nombre,fecha,null,true,valor));//DE DONDE CARAJOS SACAMOS LA OTRA FECHA
    } 
    public Instructor getInstructor(int idInstructor){
        for(Instructor instructor:instructores){
            if(instructor.getId()==idInstructor){
                return instructor;
            }
        }
        return null;
    }
    public void addPlan(String nombre,LocalDate fecha,float valor,float valorMax){
        planes
    }
}
