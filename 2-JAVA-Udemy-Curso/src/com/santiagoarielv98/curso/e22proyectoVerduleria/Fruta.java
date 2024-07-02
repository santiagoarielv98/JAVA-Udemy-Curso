package com.santiagoarielv98.curso.e22proyectoVerduleria;

public class Fruta extends Producto{
    private final double peso;
    private final String color;

    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", peso: " + getPeso() +
                ", color: " + getColor();
    }
}
