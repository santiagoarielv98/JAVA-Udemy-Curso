package com.santiagoarielv98.curso.e20proyectoOrdenCompra;

public class Cliente {

    private final String nombre;
    private final String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }
}
