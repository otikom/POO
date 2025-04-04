/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.producto;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Plan  extends Producto{
    private float valorMaximoCurso;
    private ArrayList<Plan> planes;

    public Plan(float valorMaximoCurso, ArrayList<Plan> planes, int id, String nombre, LocalDate fechainicio, LocalDate fechafin, Boolean estadoActivo, float valor) {
        super(id, nombre, fechainicio, fechafin, estadoActivo, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = planes;
    }
    
}
