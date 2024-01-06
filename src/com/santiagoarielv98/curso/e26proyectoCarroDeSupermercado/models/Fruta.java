package com.santiagoarielv98.curso.e26proyectoCarroDeSupermercado.models;

public class Fruta extends Producto {
    private final double peso;
    private final String color;

    public Fruta(String nombre, Integer precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
