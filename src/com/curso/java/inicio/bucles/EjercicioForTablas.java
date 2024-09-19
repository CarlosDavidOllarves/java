package com.curso.java.inicio.bucles;
import java.util.Scanner;
public class EjercicioForTablas {


public static void main(String[] args) {
		
		for (int j=1;j<=10;j++) {
			System.out.println("\nTabla del "+j);
			for (int i=1; i<=10 ; i++) {
				System.out.println("\t"+j+"x"+i+" = " + (j*i));
			}
			//Preguntar si se desea continuar, si dicen que no deja de mostrar las tablas
			System.out.println("Deseas continuar??");
			Scanner scan = new Scanner(System.in);
			String respuesta = scan.nextLine();
			
			if(respuesta.equalsIgnoreCase("no")) {
				break;
				//j=11;
			}
			
		}
		System.out.println("ADIOS!!!");

	}

}


