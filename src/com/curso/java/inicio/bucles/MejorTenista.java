package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class MejorTenista {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de tenistas: ");
        int numTenistas = scanner.nextInt();
        
        
        String mejorTenista = "";
        int mejorPosicion = Integer.MAX_VALUE;
        int tenistasTop10 = 0;
        int posicion = 0;
        
        for (int i = 0; i <= numTenistas; i++) {
            System.out.print("Ingrese el nombre del tenista " + i + ": ");    
            scan = new Scanner(System.in);
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese la posición en el ranking de " + nombre + ": ");
            scanner.nextLine(); 
            
            if (posicion <= 10) {
                tenistasTop10++;
            }
            
            if (posicion < mejorPosicion) {
                mejorPosicion = posicion;
                mejorTenista = nombre;
             }
        }
       
        System.out.println("Hay " + tenistasTop10 + " tenistas entre los 10 primeros.");
        System.out.println("El mejor tenista es " + mejorTenista + " en la posición " + mejorPosicion + ".");
        
		 scanner.close();
	}

}
