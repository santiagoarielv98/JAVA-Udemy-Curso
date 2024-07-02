package com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.classes;

import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.abstracts.Electronico;

public class IPhone extends Electronico {
    private final String color;
    private final String modelo;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public Double getPrecioVenta() {
        return getPrecio() * 1.3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + getColor() + "\nModelo: " + getModelo() + "\nPrecio de venta: " + getPrecioVenta();
    }
}
