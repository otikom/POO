/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.producto.Plan;
import core.producto.Producto;
import core.producto.ProductoCliente;
import java.util.ArrayList;

/**
 *
 * @author Alexander Sanguino
 */
public class Cliente {
    private ArrayList<Plan> planes;
    private ArrayList<Producto> productos;

    public Cliente() {
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }
    public boolean addProducto(Producto producto){
        if(!productos.contains(producto)){
            productos.add(producto);
            return true;
        }
        return false;
    }
    public boolean addPlan(Plan plan){
        if(!planes.contains(plan)){
            planes.add(plan);
            return true;
        }
        return false;
    }
}
