package com.curso.java.utils;

import java.util.Scanner;

public class Utilidades {

	
	public static int pideDatoNumerico (String pregunta) {
		int dato=0;
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextInt();
		
		return dato;
	}
		
	public static String pideDatoString (String pregunta) {
		String dato = "";
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextLine();
		
		return dato;	
	
	}
	
}