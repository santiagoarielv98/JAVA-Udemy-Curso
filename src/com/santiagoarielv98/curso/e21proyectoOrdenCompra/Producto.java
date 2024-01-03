package com.santiagoarielv98.curso.e21proyectoOrdenCompra;

public class Producto {
    private String fabricante;
    private String nombre;
    private int precio;

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
