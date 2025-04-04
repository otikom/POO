/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Cliente;
import core.persona.Instructor;
import core.producto.Curso;
import core.producto.Plan;
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
     
}
