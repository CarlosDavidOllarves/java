package com.curso.java.inicio.bucles;
import java.util.Scanner;

public class RuletaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo = 500.0;//Saldo del usuario
		String respuesta = "";
		
		do {
			double importeApostado = 0;
			Scanner scan = new Scanner(System.in);
			
			do {
				System.out.println("Tienes "+saldo+"¿Cuánto quieres apostar?");
				
				importeApostado = scan.nextDouble();
				
				if (importeApostado>saldo) {
					System.out.println("Importe insuficiente. No puedes apostar más del saldo disponible");
				}
			}while(importeApostado>saldo);
			
			
			System.out.println("¿Por qué número quieres apostar?");
			scan = new Scanner(System.in);
			int numApuesta = scan.nextInt();
			
			int numeroRuleta = (int)(Math.random()*37);
			
			System.out.println("Ha salido el "+numeroRuleta);
			
			//Calculo del saldo restante después de jugar
			saldo -= importeApostado;
			if (numeroRuleta==numApuesta) {//Usuario gana
				System.out.println("He ganado");
				//saldo = saldo + importeApostado * 36 ;
				//Esto es lo mismo
				saldo += importeApostado * 36;
			}else {//Usuario pierde
				System.out.println("He perdido");
			}
			System.out.println("Tu saldo es "+saldo);
			
			if(saldo<=0) {
				System.out.println("Te has quedado sin saldo, vuelve pronto");
				break;
			}else {
				System.out.println("¿Deseas seguir jugando?");
				scan = new Scanner(System.in);
				respuesta = scan.nextLine();
			}
		}while(respuesta.equalsIgnoreCase("si"));
		
		System.out.println("ADIOS!");

	}

}
