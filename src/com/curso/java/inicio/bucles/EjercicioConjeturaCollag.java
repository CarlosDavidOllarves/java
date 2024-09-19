package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioConjeturaCollag {

	public static void main(String[] args) {
        System.out.println("Numero a calcular:");
        Scanner scanner = new Scanner(System.in);
        int numCalc = scanner.nextInt();
        
                
        while (numCalc != 1) {
            System.out.print(numCalc + " -> ");
            
            if (numCalc % 2 == 0) {
                numCalc = numCalc / 2;
            } else {
            	numCalc = numCalc * 3 + 1;
            }    
          
        }
        
        System.out.println(numCalc);            
        		
	}

}
