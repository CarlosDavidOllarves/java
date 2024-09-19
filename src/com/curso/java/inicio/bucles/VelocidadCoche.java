package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class VelocidadCoche {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de coches: ");        
        int numCoches = scanner.nextInt();
		
        int velocidadMaxima = 0;
        
        for (int i = 1; i <= numCoches; i++) {
            System.out.print("Ingrese la velocidad del coche " + i + " (km/h): ");
            int velocidad = scanner.nextInt();
            
            if (velocidad > velocidadMaxima) {
                velocidadMaxima = velocidad;
            }
        }
		
		 System.out.println("La velocidad del coche más rápido es: " + velocidadMaxima + " km/h");
		        
		 
	}

}



