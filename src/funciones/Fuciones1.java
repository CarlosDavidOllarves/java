package funciones;

import java.util.Scanner;

public class Fuciones1 {
	//definir funcion que recibe un String y devuelve la longitud del String
	
    public static int getStringLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres saber cuántas letras tiene? Escribe lo que quieras:");
        String palabras = scanner.nextLine();
        int tamEscrito = getStringLength(palabras);
        System.out.println("La longitud de lo escrito es: " + tamEscrito);
    }

}