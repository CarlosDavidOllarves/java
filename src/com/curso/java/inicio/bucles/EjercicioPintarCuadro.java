package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioPintarCuadro {

			public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el tamaño del cuadrado: ");
	        int tamano = scanner.nextInt();
	        
	        for (int columna = 0; columna < tamano; columna++) {
	            for (int fila = 0; fila < tamano; fila++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	       			
			}
			
		}
	




