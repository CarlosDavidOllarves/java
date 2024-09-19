package com.curso.java.poo;

import com.curso.java.utils.Utilidades;

public class Cine {
	public static void main(String[] args) {
Persona persona0 = new Persona();
		
		Persona persona1 = new Persona("Eva","García","1A",28);
//		persona1.edad=28;
//		persona1.nombre="Eva";
//		persona1.apellidos="García";
//		System.out.println(persona1.edad);
		System.out.println(persona1.getNombre());
		
		//persona1.apellidos = persona1.apellidos.toUpperCase();
		String apellidosMayus= persona1.getApellidos().toUpperCase();
		persona1.setApellidos( apellidosMayus  );
		
		System.out.println(persona1.getApellidos());
		persona1.correr();
		
		String nombre = Utilidades.pideDatoString("Introduce tu nombre");
		String apellidos = Utilidades.pideDatoString("Introduce tu apellido");
		Persona persona2 = new Persona(nombre, apellidos, "2B");
		persona2.setEdad(41);
		//persona2.nombre="Luz";
		persona2.correr();
		
		Persona persona3 = new Persona("Elvis","Apellido3");
		persona3.setEdad(18);
		persona3.setDni("Apellidos3");
		//persona3.nombre="Elvis";
		persona3.correr();
		System.out.println(persona3.getApellidos().toUpperCase());
		
		Persona persona4 = persona3;
		persona4.setNombre("Carlos"); 
		System.out.println(persona3.getNombre());
		
		
		Factura factura1 = new Factura("Ref1","20240913",1000);
		
	}

}


