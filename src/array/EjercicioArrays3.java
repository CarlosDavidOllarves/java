package array;

import java.util.Scanner;

public class EjercicioArrays3 {

	public static void main(String[] args) {
//		Pedir cuantos números se van a guardar
//		Pedir los valores de cada número
//		Mostrar todos los números introducidos
//		Reordenar los números de manera inversa en el array
//		Mostrar de nuevo todos los números
		
		Scanner scanner = new Scanner(System.in);		
        System.out.println("Cuantos numeros quieres guardar:");
        int longitud = scanner.nextInt();
        
        int[] numeros = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
        	System.out.print("Introduce el número " + (i+1) + ": ");
        	scanner = new Scanner(System.in);
            numeros[i] = scanner.nextInt();			
		}
        for (int numerosT : numeros) {
        	System.out.println(numerosT);
        }
        
	}

}
