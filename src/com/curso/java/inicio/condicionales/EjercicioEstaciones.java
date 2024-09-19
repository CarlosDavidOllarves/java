package com.curso.java.inicio.condicionales;

import java.util.Scanner;

public class EjercicioEstaciones {

	public static void main(String[] args) {
		String mes = "";
		System.out.println("Escribe un mes");
		Scanner scan = new Scanner(System.in);
		mes = scan.nextLine();
		//int edad = scan.nextInt();
		System.out.println(mes);
		String estacion = "";
		
		if(mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Marzo")) {
			estacion = "Invierno";
		}else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
			estacion = "Primavera";
		}else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Septiembre")) {
			estacion = "Verano";
		}else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre")) {
			estacion = "Otoño";
		}
		
		if (estacion.equals("")) {
			System.out.println("Mes introducido erroneo");
		}else{
			System.out.println("El mes "+ mes + " está en la estación "+estacion);
			
		}

	}

}
