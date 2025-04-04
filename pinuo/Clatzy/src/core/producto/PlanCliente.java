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
public class PlanCliente extends Producto {
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(Cliente cliente, Plan plan, int id, String nombre, LocalDate fechainicio, LocalDate fechafin, Boolean estadoActivo, float valor) {
        super(id, nombre, fechainicio, fechafin, estadoActivo, valor);
        this.cliente = cliente;
        this.plan = plan;
    }
    @Override
        public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param estadoActivo
     */
    @Override
        public void setEstadoActivo(Boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public Plan getPlan() {
        return plan;
    }
        
}
