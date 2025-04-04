/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.producto;

import core.persona.Instructor;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Curso extends Producto{
    private ArrayList<Instructor> instructores;
    private ArrayList<ProductoCliente> productosCliente;

    public Curso(int id, String nombre, LocalDate fechainicio, LocalDate fechafin, Boolean estadoActivo, float valor) {
        super(id,nombre,fechainicio,fechafin,estadoActivo,valor);
        this.instructores = new ArrayList<>();
        this.productosCliente = new ArrayList<>();
    }
    public boolean addInstructor(Instructor instructor){
        if(!instructores.contains(instructor)){
            instructores.add(instructor);
            return true;
        }
        return false;
    }
    public boolean addProductoCliente(ProductoCliente productoCliente){
        if(!productosCliente.contains(productoCliente)){
            productosCliente.add(productoCliente);
            return true;
        }
        return false;
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
    
}
