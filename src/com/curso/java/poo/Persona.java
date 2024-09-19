package com.curso.java.poo;

public class Persona {
	
	//Variables de instancia o atributos
		private String nombre;//6 bits
		private String apellidos;//30bits
		private int edad;//32 bits
		private String dni;//20 bits
		
		//Constructores
		public Persona() {
			
		}
		
		public Persona (String nombre, String apellidos) {
			this.nombre=nombre;
			this.apellidos=apellidos;
		}
		
		public Persona (String nombre, String apellidos, String dni) {
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.dni= dni;
		}
		
		public Persona (String nombre, String apellidos, 
				String dni, int edad) {
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.dni= dni;
			this.edad=edad;
		}
		
		//Metodos get y set (getter y setter)
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
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}

		//Métodos
		public void correr() {
			System.out.println("La persona "+ nombre + " está corriendo");
			if (edad<20) {
				System.out.println("Muy rápido");
			}else if(edad<40) {
				System.out.println("Rápido");
			}else {
				System.out.println("Lento");
			}
		}
		
		public void comer() {
			System.out.println("La persona "+ nombre + " está comiendo");
		}
		
	}