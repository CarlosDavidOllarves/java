package funciones;

import java.util.Scanner;

public class Funciones2 {
//Funcion que recibe un numero y un texto y me va a pintar el texto que le pasemos el numéro indicado por el parámetro
	
public static void imprimirRepeticiones(int n, String text) {
    for (int i = 0; i < n; i++) {
        System.out.println(text);
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe una palabra u oración:");
    String palabras = scanner.nextLine();

    System.out.println("Las veces que quieres que lo repitamos:");
    int repeticion = scanner.nextInt();

    System.out.println("Imprimiendo las repeticiones:");
    imprimirRepeticiones(repeticion, palabras);

	}

}

