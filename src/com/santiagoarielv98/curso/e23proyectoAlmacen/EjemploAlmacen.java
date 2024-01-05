package com.santiagoarielv98.curso.e23proyectoAlmacen;

public class EjemploAlmacen {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];

        Almacen almacen = new Almacen();

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor();

        almacen.agregarCliente(cliente1);
        almacen.agregarCliente(cliente2);

        almacen.agregarVendedor(vendedor1);
        almacen.agregarVendedor(vendedor2);

        Alimento a1 = new Alimento();
        Perecedero p1 = new Perecedero();
        NoPerecedero np1 = new NoPerecedero();
        ArticuloLimpieza al1 = new ArticuloLimpieza();
        Alimento a2 = new Alimento();
        Perecedero p2 = new Perecedero();
        NoPerecedero np2 = new NoPerecedero();
        ArticuloLimpieza al2 = new ArticuloLimpieza();

        productos[0] = a1;
        productos[1] = p1;
        productos[2] = np1;
        productos[3] = al1;
        productos[4] = a2;
        productos[5] = p2;
        productos[6] = np2;
        productos[7] = al2;

        for(Producto producto : productos){
            System.out.println(producto);
        }

    }
}
