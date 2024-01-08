package com.santiagoarielv98.curso.e34calcularImporteProducto;


import java.util.ArrayList;
import java.util.List;

public class Ejercicio34 {

    public static void main(String[] args) {
        List<Producto> listaProducto = new ArrayList<>();

        listaProducto.add(new Producto(19.99, 5));
        listaProducto.add(new Producto(49.99, 2));
        listaProducto.add(new Producto(9.99, 10));
        listaProducto.add(new Producto(29.99, 4));
        listaProducto.add(new Producto(99.99, 1));

        listaProducto.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(Double::sum)
                .ifPresent(r -> System.out.println("El resultado es: " + r));
    }
}


class Producto {
    private final double precio;
    private final int cantidad;

    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}