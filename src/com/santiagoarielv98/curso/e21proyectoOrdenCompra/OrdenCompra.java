package com.santiagoarielv98.curso.e21proyectoOrdenCompra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {
    private static Integer contador = 0;
    private final Integer identificador = OrdenCompra.contador;
    private final String descripcion;
    private Date fecha;
    private Cliente cliente;
    private final Producto[] productos = new Producto[4];

    private int cantidadProducto;

    public OrdenCompra(String descripcion) {
        OrdenCompra.contador++;
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        if (cantidadProducto < this.productos.length) {
            this.productos[cantidadProducto++] = producto;
        }
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.cantidadProducto; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder listaProducto = new StringBuilder();

        for (Producto producto : this.productos) {
            listaProducto.append(producto).append(" ");
        }


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return
                "=====================\n" +
                        "OrdenCompra: " + identificador +
                        "\ndescripcion -> " + descripcion +
                        "\nfecha: " + formatter.format(fecha) +
                        "\ncliente: " + cliente +
                        "\nproductos: [ " + listaProducto + ']' +
                        "\ncantidadProducto: " + cantidadProducto +
                        "\ntotal: $" + getTotal() + '\n' +
                        '}' +
                        "\n=====================";

    }
}
