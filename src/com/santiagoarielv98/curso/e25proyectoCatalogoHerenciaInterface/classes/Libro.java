package com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.classes;

import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.abstracts.Producto;
import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    private final Date fechaPublicacion;
    private final String autor;
    private final String titulo;
    private final String editorial;


    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
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
        return super.toString() + "\nFecha de publicación: " + getFechaPublicacion() + "\nAutor: " + getAutor() +
                "\nTítulo: " + getTitulo() + "\nEditorial: " + getEditorial() + "\nPrecio de venta: " + getPrecioVenta();
    }
}
