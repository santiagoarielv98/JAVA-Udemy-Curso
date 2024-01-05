package com.santiagoarielv98.curso.e24proyectoMamiferos.felinos;

public class Leon extends Felino{
    private final int numManada;
    private final float potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león está comiendo";
    }

    @Override
    public String dormir() {
        return "El león está durmiendo";
    }

    @Override
    public String correr() {
        return "El león está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El león está comunicándose";
    }

    @Override
    public String toString() {
        return "Hola, soy un león y mi nombre científico es " +
                this.getNombreCientifico() +
                ". habito en " +
                this.getHabitat() +
                ", mido " +
                this.getAltura() +
                " metros de altura, " +
                this.getLargo() +
                " metros de largo, peso " +
                this.getPeso() +
                " kilogramos, mis garras miden " +
                this.getTamanioGarras() +
                " centímetros, mi velocidad es de " +
                this.getVelocidad() +
                " kilómetros por hora, mi potencia de rugido es de " +
                this.getPotenciaRugidoDecibel() +
                " decibeles y mi número de manada es " +
                this.getNumManada() +
                ".";
    }
}
