package com.curso.java.poo;

public class CarreradeCaballos {
	public class Caballo {
		private String id;
		private String nombre;
		private int numero;
		private int edad;
		private int velocidad;
		private double peso;
	}
	public class Carrera {
		private String id;
		private String nombre;
		private String Caballo[];
		private int distancia;
	}
	public class GranPremio {
		private String id;
		private String nombre;
		private String carrera[];
	}	
	public class Apostante {
		private String id;
		private String nombre;
		private double saldo;
		private double apusta;
	}
	

}