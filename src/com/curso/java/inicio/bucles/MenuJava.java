package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class MenuJava {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
	       boolean salir = false;
	       int opcion; 
	       
	       while(!salir){
	           
	           System.out.println("1. Pintar cuadrado");
	           System.out.println("2. Validar email");
	           System.out.println("3. Crear alumno");
	           System.out.println("4. Salir");
	           
	           System.out.println("Escribe una de las opciones");
	           opcion = scanner.nextInt();
	           
	           switch(opcion){
               case 1:
            	   System.out.print("Ingrese el tamaño del cuadrado: ");
       	        int tamano = scanner.nextInt();
       	        
       	        for (int i = 0; i < tamano; i++) {
       	            for (int j = 0; j < tamano; j++) {
       	                System.out.print("* ");
       	            }
       	            System.out.println();
       	        }
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
	           
	           		}
	       }
	}
}
	       

	


