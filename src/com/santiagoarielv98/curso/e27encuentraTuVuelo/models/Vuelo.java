package com.santiagoarielv98.curso.e27encuentraTuVuelo.models;

import java.util.Date;

public class Vuelo {
    private final String nombre;
    private final String origen;
    private final String destino;
    private final Date fechaLLegada;
    private final Integer numPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaLLegada, Integer numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLLegada = fechaLLegada;
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaLLegada() {
        return fechaLLegada;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaLLegada=" + fechaLLegada +
                ", numPasajeros=" + numPasajeros +
                '}';
    }
}
