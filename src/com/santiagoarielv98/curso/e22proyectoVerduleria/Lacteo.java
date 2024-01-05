package com.santiagoarielv98.curso.e22proyectoVerduleria;

public class Lacteo extends Producto{
    private final int cantidad;
    private final int proteinas;

    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
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

    @Override
    public String toString() {
        return super.toString() +
                ", cantidad: " + getCantidad() +
                ", proteinas: " + getProteinas();
    }
}
