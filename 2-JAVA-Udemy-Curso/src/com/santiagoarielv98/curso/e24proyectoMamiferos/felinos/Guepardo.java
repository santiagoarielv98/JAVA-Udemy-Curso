package com.santiagoarielv98.curso.e24proyectoMamiferos.felinos;

public class Guepardo extends Felino{

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo está comiendo";
    }

    @Override
    public String dormir() {
        return "El guepardo está durmiendo";
    }

    @Override
    public String correr() {
        return "El guepardo está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El guepardo está comunicándose";
    }

    @Override
    public String toString() {
        return "Hola, soy un guepardo y mi nombre científico es " +
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
                " centímetros y mi velocidad es de " +
                this.getVelocidad() +
                " kilómetros por hora.";
    }
}
