/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.producto;

import java.time.LocalDate;


/**
 *
 * @author Alexander Sanguino
 */
public abstract class Producto {
    protected int id;
    protected String nombre;
    protected LocalDate fechainicio;
    protected LocalDate fechafin;
    protected Boolean estadoActivo;
    protected float valor;

    public Producto(int id, String nombre, LocalDate fechainicio, LocalDate fechafin, Boolean estadoActivo, float valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estadoActivo = estadoActivo;
        this.valor = valor;
    }

    public void setEstadoActivo(Boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public Boolean getEstadoActivo() {
        return estadoActivo;
    }

    public float getValor() {
        return valor;
    }

    
}
