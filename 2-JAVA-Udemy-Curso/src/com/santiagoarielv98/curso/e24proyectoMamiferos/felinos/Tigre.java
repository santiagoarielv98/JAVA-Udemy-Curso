package com.santiagoarielv98.curso.e24proyectoMamiferos.felinos;

public class Tigre extends Felino{
    private final String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre está comiendo";
    }

    @Override
    public String dormir() {
        return "El tigre está durmiendo";
    }

    @Override
    public String correr() {
        return "El tigre está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El tigre está comunicándose";
    }

    @Override
    public String toString() {
        return "Hola, soy un tigre y mi nombre científico es " +
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
                " kilómetros por hora y mi especie es " +
                this.especieTigre +
                ".";
    }
}
