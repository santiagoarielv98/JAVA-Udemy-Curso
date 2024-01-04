package com.santiagoarielv98.curso.e23proyectoVerduleria;

public class Limpieza extends Producto{
    private final String componentes;
    private final double litros;

    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", componentes: " + getComponentes()  +
                ", litros: " + getLitros();
    }
}
