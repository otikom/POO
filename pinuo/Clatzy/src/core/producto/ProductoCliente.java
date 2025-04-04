/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.producto;

import core.persona.Cliente;
import java.time.LocalDate;

/**
 *
 * @author Alexander Sanguino
 */
public class ProductoCliente extends Producto {
    private Boolean estadoAprobado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso;

    public ProductoCliente(Boolean estadoAprobado, int nivelAvance, Cliente cliente, Curso curso, int id, String nombre, LocalDate fechainicio, LocalDate fechafin, Boolean estadoActivo, float valor) {
        super(id, nombre, fechainicio, fechafin, estadoActivo, valor);
        this.estadoAprobado = estadoAprobado;
        this.nivelAvance = nivelAvance;
        this.cliente = cliente;
        this.curso = curso;
    }


    
}
