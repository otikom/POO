/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.producto.Curso;
import core.producto.Plan;
import core.producto.PlanCliente;
import core.producto.Producto;
import core.producto.ProductoCliente;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Cliente extends Persona{
    private ArrayList<PlanCliente> planes;
    private ArrayList<ProductoCliente> productos;

    public Cliente(String nombre, String cedula, String telefono, String email) {
        super(nombre,cedula,telefono,email);
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }
    public boolean addProducto(ProductoCliente producto){
        if(!productos.contains(producto)){
            productos.add(producto);
            return true;
        }
        return false;
    }
    public boolean addPlan(PlanCliente plan){
        if(!planes.contains(plan)){
            planes.add(plan);
            return true;
        }
        return false;
    }

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }
    public PlanCliente getPlan(int index) {
        return planes.get(index);
    }

    public ArrayList<ProductoCliente> getProductos() {
        return productos;
    }
    public boolean noTieneCurso(Curso curso){
        for(ProductoCliente producto:productos){
            if(producto.getId()==curso.getId()){
                return false;
            }
        }
        return true;
    }
    @Override
        public String getNombre() {
        return nombre;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
