package com.santiagoarielv98.curso.e21proyectoCompania;

public class Empleado extends Persona{
    private Double remuneracion;
    private final int empleadoId;
    private static int contador = 0;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = contador++;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += porcentaje;
    }


    @Override
    public String toString() {
        return super.toString() + ", remuneracion: " + getRemuneracion() +
                ", empleadoId: " + getEmpleadoId();
    }
}
