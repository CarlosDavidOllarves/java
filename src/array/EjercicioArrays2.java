package array;

import java.util.Scanner;

public class EjercicioArrays2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos nombres de Alumnos quieres introducir:");
        int longitud = scanner.nextInt();
        
        String[] nombres = new String [longitud];
        
        for (int i = 0; i < longitud; i++) {
        	System.out.println("Introduce el Nombre del Alumno " + (i+1) + ": ");
        	scanner = new Scanner(System.in);
        	nombres[i] = scanner.nextLine();
        }
        
        System.out.println("Alumnos que contienen A en su nombre: ");
        for (String nombre : nombres) {
        	if (nombre.toLowerCase().contains("a")) {
        		System.out.println(nombre);
        	}
        }

	}

}
