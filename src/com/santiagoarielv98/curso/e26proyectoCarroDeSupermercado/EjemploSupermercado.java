package com.santiagoarielv98.curso.e26proyectoCarroDeSupermercado;

import com.santiagoarielv98.curso.e26proyectoCarroDeSupermercado.models.BolsaSupermercado;
import com.santiagoarielv98.curso.e26proyectoCarroDeSupermercado.models.*;

public class EjemploSupermercado {
    public static void main(String[] args) {
        BolsaSupermercado<Lacteo> bolsaDeLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> bolsaDeFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaDeLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaDeNoPerecible = new BolsaSupermercado<>();

        bolsaDeLacteos.addProducto(new Lacteo("Leche Entera", 20, 1000, 32));
        bolsaDeLacteos.addProducto(new Lacteo("Queso Cheddar", 50, 500, 25));
        bolsaDeLacteos.addProducto(new Lacteo("Yogur Natural", 15, 200, 10));
        bolsaDeLacteos.addProducto(new Lacteo("Mantequilla", 40, 250, 1));
        bolsaDeLacteos.addProducto(new Lacteo("Crema de Leche", 30, 500, 15));

        bolsaDeFrutas.addProducto(new Fruta("Manzana", 5, 0.15, "Rojo"));
        bolsaDeFrutas.addProducto(new Fruta("Plátano", 3, 0.2, "Amarillo"));
        bolsaDeFrutas.addProducto(new Fruta("Kiwi", 8, 0.05, "Verde"));
        bolsaDeFrutas.addProducto(new Fruta("Naranja", 4, 0.3, "Naranja"));
        bolsaDeFrutas.addProducto(new Fruta("Uva", 6, 0.25, "Morado"));

        bolsaDeLimpieza.addProducto(new Limpieza("Detergente Líquido", 20, "Tensoactivos, enzimas, fragancia", 2.0));
        bolsaDeLimpieza.addProducto(new Limpieza("Lavavajillas", 15, "Agentes de limpieza, colorantes, aroma", 1.5));
        bolsaDeLimpieza.addProducto(new Limpieza("Desinfectante Multiusos", 25, "Alcohol, cloruro de benzalconio, esencias", 1.0));
        bolsaDeLimpieza.addProducto(new Limpieza("Limpiador de Vidrios", 18, "Amoniaco, agentes de limpieza, colorantes", 1.2));
        bolsaDeLimpieza.addProducto(new Limpieza("Suavizante de Telas", 22, "Compuestos catiónicos, fragancias, conservantes", 3.0));

        bolsaDeNoPerecible.addProducto(new NoPerecible("Arroz", 10, 1000, 360)); // Contenido en gramos, calorías por 100 gramos
        bolsaDeNoPerecible.addProducto(new NoPerecible("Lentejas", 12, 500, 353));
        bolsaDeNoPerecible.addProducto(new NoPerecible("Pasta", 8, 500, 371));
        bolsaDeNoPerecible.addProducto(new NoPerecible("Conserva de Atún", 15, 200, 190));
        bolsaDeNoPerecible.addProducto(new NoPerecible("Galletas", 5, 300, 480));

        bolsaDeLacteos.getProductos().forEach((lacteo)-> System.out.println("Nombre: " + lacteo.getNombre() + " - Precio: " + lacteo.getPrecio() + " - Cantidad: " + lacteo.getCantidad() + " - Proteínas: " + lacteo.getProteinas()));

        bolsaDeFrutas.getProductos().forEach((fruta)-> System.out.println("Nombre: " + fruta.getNombre() + " - Precio: " + fruta.getPrecio() + " - Peso: " + fruta.getPeso() + " - Color: " + fruta.getColor()));

        bolsaDeLimpieza.getProductos().forEach((limpieza)-> System.out.println("Nombre: " + limpieza.getNombre() + " - Precio: " + limpieza.getPrecio() + " - Componentes: " + limpieza.getComponentes() + " - Litros: " + limpieza.getLitros()));

        bolsaDeNoPerecible.getProductos().forEach((noPerecible)-> System.out.println("Nombre: " + noPerecible.getNombre() + " - Precio: " + noPerecible.getPrecio() + " - Contenido: " + noPerecible.getContenido() + " - Calorías: " + noPerecible.getCalorias()));

    }
}
