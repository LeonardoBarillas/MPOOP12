/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop12;

/**
 * Clase Platillo
 * @author Barillas
 */
public class Platillo {
    private String nombre;
    private double precio;
    private String ingredientes;

    /**
     * Constructor vacio
     */
    public Platillo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Platillo{" + "nombre=" + nombre + ", precio=" + precio + 
                ", ingredientes=" + ingredientes + '}';
    }
    
    
}
