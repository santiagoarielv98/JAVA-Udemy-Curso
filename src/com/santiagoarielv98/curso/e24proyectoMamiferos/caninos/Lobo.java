package com.santiagoarielv98.curso.e24proyectoMamiferos.caninos;

public class Lobo extends Canino{
    private final int numCamada;
    private final String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillo, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillo);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo está comiendo";
    }

    @Override
    public String dormir() {
        return "El lobo está durmiendo";

    }

    @Override
    public String correr() {
        return "El lobo está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El lobo está comunicándose";
    }

    @Override
    public String toString() {
        return "Hola, soy un lobo y mi nombre científico es " +
                this.getNombreCientifico() +
                ". habito en " +
                this.getHabitat() +
                ", mido " +
                this.getAltura() +
                " metros de altura, " +
                this.getLargo() +
                " metros de largo, peso " +
                this.getPeso() +
                " kilogramos, mi color es " +
                this.getColor() +
                ", mis colmillos miden " +
                this.getTamanioColmillo() +
                " centímetros, mi especie es " +
                this.getEspecieLobo() +
                " y mi número de camada es " +
                this.getNumCamada() +
                ".";
    }
}
