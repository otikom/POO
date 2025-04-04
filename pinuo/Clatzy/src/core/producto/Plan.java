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

    public Plan(int id,String nombre,LocalDate fechainicio,LocalDate fechafin,boolean estado,float valor,float valormax) {
        super(id, nombre, fechainicio, fechafin, estado, valor);
        this.valorMaximoCurso = valormax;
        this.planes = new ArrayList<>();
    }
    @Override
      public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public LocalDate getFechainicio() {
        return fechainicio;
    }

    @Override
    public LocalDate getFechafin() {
        return fechafin;
    }

    @Override
    public Boolean getEstadoActivo() {
        return estadoActivo;
    }

    @Override
    public float getValor() {
        return valor;
    }

    public float getValorMaximoCurso() {
        return valorMaximoCurso;
    }
    
}
