package com.santiagoarielv98.e21proyectoOrdenCompra;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Santiago", "Villanueva");

        Producto[] listaProducto1 = {
                new Producto("motorola", "edge 40", 300),
                new Producto("samsung", "s23+", 400),
                new Producto("apple", "12", 500),
                new Producto("xiaomi", "11t", 600)
        };

        Producto[] listaProducto2 = {
                new Producto("motorola", "edge 30 neo", 700),
                new Producto("samsung", "a54", 800),
                new Producto("apple", "11", 900),
                new Producto("xiaomi", "Readmi note 12 pro", 1000)
        };

        Producto[] listaProducto3 = {
                new Producto("motorola", "razr 40", 1100),
                new Producto("samsung", "s22 plus", 1200),
                new Producto("apple", "10", 1300),
                new Producto("xiaomi", "10c", 1400)
        };

        OrdenCompra orden1 = new OrdenCompra("Orden 1");
        orden1.setCliente(cliente);
        orden1.setFecha(new Date());
        for (Producto producto : listaProducto1) {
            orden1.addProducto(producto);
        }

        OrdenCompra orden2 = new OrdenCompra("Orden 2");
        orden2.setCliente(cliente);
        orden2.setFecha(new Date());
        for (Producto producto : listaProducto2) {
            orden2.addProducto(producto);
        }
        OrdenCompra orden3 = new OrdenCompra("Orden 3");
        orden3.setCliente(cliente);
        orden3.setFecha(new Date());
        for (Producto producto : listaProducto3) {
            orden3.addProducto(producto);
        }

        System.out.println("Imprimiendo en pantalla");
        System.out.println("=======================");
        System.out.println(orden1);
        System.out.println(orden2);
        System.out.println(orden3);
    }
}
