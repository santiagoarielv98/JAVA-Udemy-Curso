package com.santiagoarielv98.curso.e22proyectoCompania;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Santiago","Villanueva","12345678","calle falsa 123",50000.00, 1000.00);

        System.out.println(gerente);
        System.out.println("================");

        gerente.setPresupuesto(1500.00);

        System.out.println(gerente);
        System.out.println("================");

        Empleado empleado = new Empleado("Max","Power","55555555","calle falsa 555", 25000.00);

        System.out.println(empleado);
        System.out.println("================");

        empleado.aumentarRemuneracion(30000);

        System.out.println(empleado);

        Cliente cliente = new Cliente("Homero","Simpson","11111111","Avenida Siempreviva 742");

        System.out.println(cliente);
    }
}
