package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioPintarCuadrado1 {

	public static void main(String[] args) {
		System.out.println("Escribe tamaño del cuadrado");
		Scanner scan = new Scanner(System.in);
		int tamanio = scan.nextInt();
		
		int fila =0;
		while(tamanio>fila) {
			int columna = 0;
			while (tamanio>columna) {
				if (fila==0 || fila==(tamanio-1) || columna==0 || columna == (tamanio-1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				columna++;
			}
			fila++;
			System.out.println();
		}
		
		System.out.println();
        

	}

}
