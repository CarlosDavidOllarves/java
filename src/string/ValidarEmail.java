package string;

import java.util.Scanner;

public class ValidarEmail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu email:");
        String email = scanner.nextLine();
       
        //email sin espacios
        String emailSinEspacios = email.trim();
        
        //email con un solo @
        int contadorArroba = 0;
		for ( int i=0 ;  i<emailSinEspacios.length() ; i++ ) {			
			if (emailSinEspacios.charAt(i)=='@') {
				contadorArroba++;
			}			
		}
		if (contadorArroba!=1) {
		System.out.println("El email debe contener un Arroba (@): ");
		
		}
		// El email no puede contener espacios en blanco
		String respuesta = "";
		if (emailSinEspacios.contains(" ")) {
			System.out.println("El email no debe tener espcios en blanco ");       
        

	}

}
}