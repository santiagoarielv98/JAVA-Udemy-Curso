package com.santiagoarielv98.curso.e24proyectoMamiferos.caninos;

public class Perro extends Canino{
    private final int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillo, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillo);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro está comiendo";
    }

    @Override
    public String dormir() {
        return "El perro está durmiendo";
    }

    @Override
    public String correr() {
        return "El perro está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El perro está comunicándose";
    }

    @Override
    public String toString() {
        return "Hola, soy un perro y mi nombre científico es " +
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
                " centímetros y mi fuerza de mordida es de " +
                this.getFuerzaMordida() +
                " Newtons.";
    }
}
