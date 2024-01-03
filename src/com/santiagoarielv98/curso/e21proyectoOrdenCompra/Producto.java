package com.santiagoarielv98.curso.e21proyectoOrdenCompra;

public class Producto {
    private final String fabricante;
    private final String nombre;
    private final int precio;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return '(' + fabricante + ", " + nombre + ", $" + precio + ')';
    }
}
