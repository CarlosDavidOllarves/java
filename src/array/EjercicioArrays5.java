package array;
import java.util.Scanner;

public class EjercicioArrays5 {

	public static void main(String[] args) {
//		De una matriz 4x4
//		Pedir los datos de la matriz
//		Sacar los números de la diagonal
//		Invertir la diagonal y mostrar la matriz
		Scanner scanner = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		int[] diagonal = new int[4];
//		int i;
//		int j;
		 System.out.println("Introduce los elementos de la matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }	            
	        }
	        for (int i = 0; i < 4; i++) {
	            diagonal[i] = matriz[i][i];
	        }

	        System.out.println("\nDiagonal extraida:");
	        for (int num : diagonal) {
	            System.out.print(num + " ");	        
	        }     	
	        System.out.println();
	        System.out.println("\nMatriz Original");
	        for (int i = 0; i < matriz.length; i++) {
	        	for (int j = 0; j < matriz[i].length; j++) {
	        		System.out.print(matriz[i][j] + " ");
        }
	        	System.out.println();
	}

	        
}
			
}