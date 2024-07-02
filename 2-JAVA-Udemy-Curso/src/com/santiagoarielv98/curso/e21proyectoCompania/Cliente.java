package com.santiagoarielv98.curso.e21proyectoCompania;

public class Cliente extends Persona{
    private final int clienteId;
    private static int contador = 0;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = contador++;
    }

    public int getClienteId() {
        return clienteId;
    }


    @Override
    public String toString() {
        return super.toString() + ", clienteId: " + getClienteId();
    }
}
