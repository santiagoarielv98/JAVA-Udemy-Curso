package com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface;

import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.classes.Comics;
import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.classes.IPhone;
import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.classes.Libro;
import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.classes.TvLcd;
import com.santiagoarielv98.curso.e25proyectoCatalogoHerenciaInterface.interfaces.IProducto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) throws ParseException {
        IProducto[] productos = new IProducto[5];

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaLibro = sdf.parse("2010-01-01");
        Date fechaBatman = sdf.parse("1988-03-29");
        Date fechaSpiderman = sdf.parse("1973-06-01");

        TvLcd tv = new TvLcd(1000, "Sony", 32);
        Libro libro = new Libro(100, fechaLibro, "Autor1", "Titulo1", "Editorial1");
        IPhone phone = new IPhone(500,"Apple","Blanco","iPhone 6");
        Comics batmanComic = new Comics(15, fechaBatman, "Alan Moore", "The Killing Joke", "DC Comics", "Batman");
        Comics spidermanComic = new Comics(12, fechaSpiderman, "Gerry Conway", "The Night Gwen Stacy Died", "Marvel Comics", "Spider-Man");

        productos[0] = tv;
        productos[1] = libro;
        productos[2] = phone;
        productos[3] = batmanComic;
        productos[4] = spidermanComic;

        for (IProducto producto : productos) {
            System.out.println(producto.toString());
            System.out.println();
        }

    }
}
