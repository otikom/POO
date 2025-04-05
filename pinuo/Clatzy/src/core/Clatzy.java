/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Cliente;
import core.persona.Instructor;
import core.producto.Curso;
import core.producto.Plan;
import core.producto.PlanCliente;
import core.producto.ProductoCliente;
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

    public void addInstructor(String nombre, String cedula, String telefono, String email) {
        instructores.add(new Instructor(nombre, cedula, telefono, email));
    }

    public void addCurso(int idCurso, String nombre, LocalDate fecha, float valor, Instructor instructor) {
        cursos.add(new Curso(idCurso, nombre, fecha, null, true, valor));
    }

    public void addPlan(String nombre, LocalDate fecha, float valor, float valorMax) {
        planes.add(new Plan(1, nombre, fecha, null, true, valor, valorMax));
    }

    public Instructor getInstructor(int index) {
        return instructores.get(index);
    }

    public Cliente getCliente(int index) {
        return clientes.get(index);
    }

    public Plan getPlan(int index) {
        return planes.get(index);
    }

    public Curso getCurso(int index) {
        return cursos.get(index);
    }

    public void comprarPlan(Cliente cliente, Plan plan, LocalDate date) {
        boolean puedeComprar = true;
        for (PlanCliente planc : cliente.getPlanes()) {
            if (planc.getEstadoActivo()) {
                planc.setEstadoActivo(false);
                puedeComprar = false;
            }
        }
        if (puedeComprar) {
            PlanCliente plancliente = new PlanCliente(cliente, plan, plan.getId(), plan.getNombre(), date, null, true, plan.getValor());
            cliente.addPlan(plancliente);
            System.out.println("Cliente " + cliente.getNombre() + " compró exitosamente" + " el plan " + plancliente.getNombre());
        } else {
            System.out.println("Cliente " + cliente.getNombre() + " ya tiene un plan activo");
        }
    }

    public void comprarCurso(Cliente cliente, Curso curso, LocalDate date) {
        if (cliente.noTieneCurso(curso)) {
            if (cliente.planCubreCurso(curso)) {
                ProductoCliente productocliente = new ProductoCliente(false, 0, cliente, curso, curso.getId(), curso.getNombre(), date, null, curso.getEstadoActivo(), 0);
                cliente.addProducto(productocliente);
                System.out.println("El Cliente " + cliente.getNombre() + " registró exitosamente" + " el curso " + productocliente.getNombre());
            } else {
                System.out.println("El plan del Cliente " + cliente.getNombre() + " no cubre el curso " + curso.getNombre());
            }
        } else {
            System.out.println("El cliente " + cliente.getNombre() + " ya había registrado el curso " + curso.getNombre());
        }
    }

    public void comprarCurso(Cliente cliente, Curso curso, LocalDate date, int pago) {
        if (cliente.planCubreCurso(curso)) {
            System.out.println("El curso está incluido en el plan del cliente " + cliente.getNombre() + ", por lo tanto no debe pagar");
            ProductoCliente producto = new ProductoCliente(false, 0, cliente, curso, curso.getId(), curso.getNombre(), date, null, curso.getEstadoActivo(), 0);
            cliente.addProducto(producto);
        } else {
            if (cliente.noTieneCurso(curso)) {

                if (pago < curso.getValor() | pago > curso.getValor()) {
                    System.out.println("El cliente " + cliente.getNombre() + " no pago el valor correcto por el curso " + curso.getNombre());
                } else {
                    ProductoCliente producto = new ProductoCliente(false, 0, cliente, curso, curso.getId(), curso.getNombre(), date, null, curso.getEstadoActivo(), pago);
                    cliente.addProducto(producto);
                    System.out.println("El Cliente " + cliente.getNombre() + " compró exitosamente" + " el curso " + curso.getNombre());
                }
            } else {
                System.out.println("El cliente " + cliente.getNombre() + " ya había comprado el curso " + curso.getNombre());
            }
        }
    }

    public String getClienteMayorIngreso() {
        float monto = 0;
        String nombre=" ";
        for (Cliente cliente : clientes) {
            float mt = 0;
            for (ProductoCliente productocliente : cliente.getProductos()) {
                if (productocliente.getValor() != 0) {
                    mt += productocliente.getValor();
                }
            }
            if (mt > monto) {
                monto = mt;
                nombre = cliente.getNombre();
            }
        }
        return nombre;
    }

    public void addCliente(String nombre, String cedula, String telefono, String email) {
        clientes.add(new Cliente(nombre, cedula, telefono, email));
    }

}
