package com.santiagoarielv98.curso.e26proyectoCarroDeSupermercado.models;

public class Lacteo extends Producto{
    private final int cantidad;
    private final int proteinas;

    public Lacteo(String nombre, Integer precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}
