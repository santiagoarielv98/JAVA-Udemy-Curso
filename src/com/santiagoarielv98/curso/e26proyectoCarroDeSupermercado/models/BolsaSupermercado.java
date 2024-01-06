package com.santiagoarielv98.curso.e26proyectoCarroDeSupermercado.models;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private final List<T> productos;
    public static int MAX = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void addProducto (T producto){
        if(productos.size() <= MAX) {
            productos.add(producto);
        }
    }

    public List<T> getProductos(){
        return productos;
    }

}
