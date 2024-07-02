package com.santiagoarielv98.curso.e24proyectoMamiferos.caninos;

import com.santiagoarielv98.curso.e24proyectoMamiferos.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;
    protected double tamanioColmillo;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillo) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillo = tamanioColmillo;
    }

    public String getColor() {
        return color;
    }

    public double getTamanioColmillo() {
        return tamanioColmillo;
    }

}
