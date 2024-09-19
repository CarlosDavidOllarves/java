package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioForFibonacci {

	public static void main(String[] args) {
		
		int numRepeticiones = (int)(Math.random()*10)+1;//Se genera de manera aleatoria un número entre 1 y 10
		System.out.println("Se van a mostra " + numRepeticiones + " de la serie de Fibonacci");
		
		int num1 = 0;
		int num2 = 1;
	
		System.out.print(""+num1+", "+num2);
		
		//Hecho con el for
		for (int i = 0; i<numRepeticiones-2; i++) {
			int suma = num1 + num2;
			System.out.print(", "+suma);
			num1 = num2;
			num2 = suma;
		}
		
		//Hecho con el while
		int repeticion=0;
		while(repeticion<numRepeticiones-2) {
			int suma = num1 + num2;
			System.out.print(", "+suma);
			num1 = num2;
			num2 = suma;
			
			repeticion++;
		}

		        
		    }
		}


