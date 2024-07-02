package com.santiagoarielv98.curso.e22proyectoVerduleria;

public class Producto {
    private final String nombre;
    private final Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
                ", precio: " + getPrecio();
    }
}
