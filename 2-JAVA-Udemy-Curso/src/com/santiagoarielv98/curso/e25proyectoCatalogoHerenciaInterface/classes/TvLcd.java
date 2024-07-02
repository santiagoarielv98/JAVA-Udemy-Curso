package com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.classes;

import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.abstracts.Electronico;

public class TvLcd extends Electronico {
    private final int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public Double getPrecioVenta() {
        return getPrecio() * 1.21;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPulgadas: " + getPulgada() + "\nPrecio de venta: " + getPrecioVenta();
    }
}