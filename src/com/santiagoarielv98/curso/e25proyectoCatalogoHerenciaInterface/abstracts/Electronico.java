package com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.abstracts;

import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico  {
    protected final String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Fabricante: " + getFabricante();
    }
}
