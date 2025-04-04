/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.producto.Curso;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Instructor extends Persona {

    private ArrayList<Curso> cursos;
    /*static Instructor createInstructor(String nombre, String cedula, String telefono, String email){
        return new Instructor(nombre,cedula,telefono,email);
    }*/
    public Instructor(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.cursos=new ArrayList<>();
    }
    public boolean addCurso(Curso curso){
        if(!cursos.contains(curso)){
            cursos.add(curso);
            return true;
        }
        return false;
    }
    @Override
        public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
}
