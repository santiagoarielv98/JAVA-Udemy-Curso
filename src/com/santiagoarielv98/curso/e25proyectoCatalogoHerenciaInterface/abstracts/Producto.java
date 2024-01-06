package com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.abstracts;

import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.interfaces.IProducto;

abstract public class Producto implements IProducto {
    protected final int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }


    @Override
    public String toString() {
        return "Precio: " + precio;
    }
}
