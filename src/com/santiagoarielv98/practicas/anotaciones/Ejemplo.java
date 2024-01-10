package com.santiagoarielv98.practicas.anotaciones;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Ejemplo {
	@EjemploAnotacion(nombre = "santiago")
	private final String nombre;
	public static void main(String[] args) {
		Ejemplo ejemplo = new Ejemplo("Santiago");

		Field[] campos = ejemplo.getClass().getDeclaredFields();

		Arrays.stream(campos).filter(e-> e.isAnnotationPresent(EjemploAnotacion.class))
				.forEach(e-> {
					e.setAccessible(true);
					EjemploAnotacion anotacion=	e.getAnnotation(EjemploAnotacion.class);
					System.out.println(anotacion.nombre());
				});
	}
	public Ejemplo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
