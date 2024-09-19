package com.curso.java.poo;

public class Alumno {
	//variables de instancias
	private String dni;
	private String nombre;
	private String apellidos;
	private double nota;
	private int medad;

	
	//constructores
	public Alumno() {

	}

	public Alumno(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Alumno(String dni, String nombre, String apellidos, double nota) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
	}
	public Alumno(String dni, String nombre, String apellidos, double nota, int medad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
		this.medad = medad;
	}
	
	//metodos get set
	
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getMedad() {
		return medad;
	}
	public void setMedad(int medad) {
		this.medad = medad;	
	}

	// metodos
	public void verNota() {

		if (medad >= 18) {
			System.out.println("La persona " + nombre + ":");
			if (nota == 10) {
				System.out.println("Es un genio");
			} else if (nota >= 5 && nota < 10) {
				System.out.println("Ha estudiado mucho");
			} else if (nota > 0 && nota < 5) {
				System.out.println("Ha estudiado poco");
			} else if (nota == 0) {
				System.out.println("No ha estudiado nada");
			} else {
				System.out.println("Verifica la nota ingresada");
			}
		} else {
			System.out.println("No tenemos permiso para mostrarte la nota");
		}
	}
}
