package com.santiagoarielv98.curso.e26proyectoCarroDeSupermercado.models;

public class Producto {
    protected String nombre;
    protected Integer precio;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }
}
