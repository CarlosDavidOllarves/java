package funciones;

import java.util.Scanner;

public class Funciones3 {
	public static void imprimirTablaMultiplicar(int number) {
	    for (int i = 1; i <= 10; i++) {
	        System.out.println(number + " x " + i + " = " + (number * i));
	    }
	}

	public static void main(String[] args) {
		// Funcion a la que le paso un numero y me pinta la tabla de multiplicar de ese numero
		Scanner scanner = new Scanner(System.in);		
        System.out.println("Que tabla quieres ver? ingresa un numero:");
        int numero = scanner.nextInt();
        imprimirTablaMultiplicar(numero);

	}

}
