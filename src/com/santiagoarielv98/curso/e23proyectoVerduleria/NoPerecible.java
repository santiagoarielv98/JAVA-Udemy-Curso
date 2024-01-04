package com.santiagoarielv98.curso.e23proyectoVerduleria;

public class NoPerecible extends Producto{
    private final int contenido;
    private final int calorias;

    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", contenido: " + getContenido() +
                ", calorias: " + getCalorias();
    }
}
