package com.santiagoarielv98.curso.e27encuentraTuVuelo;

import com.santiagoarielv98.curso.e27encuentraTuVuelo.models.Vuelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EjemploVuelo {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder()
                .setLanguage("es")
                .setRegion("ES")
                .build();

        SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMM yyyy HH:mm 'hrs'", locale);

        List<Vuelo> vuelos = new ArrayList<>();

        try {
            vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", sdf.parse("Lun 29 Ago 2021 05:39 hrs"),62));
            vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", sdf.parse("Lun 31 Ago 2021 04:45 hrs"),
                    47));
            vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", sdf.parse("Lun 30 Ago 2021 16:00 hrs"),
                    52));
            vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", sdf.parse("Lun 29 Ago 2021 13:22 hrs"), 59));
            vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", sdf.parse("Lun 31 Ago 2021 14:05 hrs"), 25));
            vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", sdf.parse("Lun 31 Ago 2021 05:20 hrs"),
                    29));
            vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", sdf.parse("Lun 30 Ago 2021 08:45 hrs"),
                    55));
            vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", sdf.parse("Lun 29 Ago 2021 07:41 hrs"),
                    51));
            vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", sdf.parse("Lun 30 Ago 2021 10:35 hrs"), 48));
            vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", sdf.parse("Lun 29 Ago 2021 09:14 hrs"),
                    59));
            vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", sdf.parse("Lun 31 Ago 2021 08:33 hrs"),
                    31));
            vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", sdf.parse("Lun 31 Ago 2021 15:15 hrs"),
                    29));
            vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", sdf.parse("Lun 30 Ago 2021 08:14 hrs"), 47));
            vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", sdf.parse("Lun 29 Ago 2021 22:53 hrs"), 60));
            vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", sdf.parse("Lun 31 Ago 2021 09:57 hrs"),
                    32));
            vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", sdf.parse("Lun 31 Ago 2021 04:00 hrs"),
                    35));
            vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", sdf.parse("Lun 29 Ago 2021 07:45 hrs"),
                    61));
            vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", sdf.parse("Lun 30 Ago 2021 07:12 hrs"),
                    58));
            vuelos.add(new Vuelo("LAT 501", "París", "Santiago", sdf.parse("Lun 29 Ago 2021 18:29 hrs"), 49));
            vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", sdf.parse("Lun 30 Ago 2021 15:45 hrs"),
                    39));

            vuelos.sort(Comparator.comparing(Vuelo::getFechaLLegada).reversed());
            Vuelo ultimoVueloEnLLegar = vuelos.getFirst();
            System.out.println("El último vuelo en llegar es "
                    + ultimoVueloEnLLegar.getNombre() +  ": "+
                    ultimoVueloEnLLegar.getOrigen() + " con destino a " +
                    ultimoVueloEnLLegar.getDestino() + ", aterriza el "
                    + sdf.format(ultimoVueloEnLLegar.getFechaLLegada()));

            vuelos.sort(Comparator.comparing(Vuelo::getNumPasajeros));
            Vuelo vueloConMenorNumPasajeros = vuelos.getFirst();
            System.out.println("El vuelo con menor número de pasajeros es "
                    + vueloConMenorNumPasajeros.getNombre() +  ": "+
                    vueloConMenorNumPasajeros.getOrigen() + " con destino a " +
                    ultimoVueloEnLLegar.getDestino() +
                    ", con " + vueloConMenorNumPasajeros.getNumPasajeros()
                    + " pasajeros.");

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
