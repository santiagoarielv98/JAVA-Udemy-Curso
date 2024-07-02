package com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.classes;

import java.util.Date;

public class Comics extends Libro {
    private final String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPersonaje: " + getPersonaje();
    }

}
