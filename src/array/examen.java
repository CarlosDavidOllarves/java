package array;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		
		boolean salir = false;
	       int opcion; 
	       
	       while(!salir){
	           
	           System.out.println("1. Primer ejercicio");
	           System.out.println("2. Segundo ejercicio");
	           System.out.println("3. tercer ejercicio");
	           System.out.println("4. cuarto ejercicio");
	           System.out.println("5. quinto ejercicio");
	           System.out.println("6. Salir");
	           
	           System.out.println("Escribe una de las opciones");
	           opcion = scanner.nextInt();
	           
	           switch(opcion){
	           case 1:
	        	   System.out.print("Ingrese una palabra: ");
	        	   Scanner scan = new Scanner(System.in);
	        	   String palabra = scanner.nextLine();
	        	   int letras = palabra.trim().length();
	        	   System.out.println("La palabra tiene " + letras + " letras.");
	        	   break;
	           case 2:
	        	   System.out.println("Introduce una palabra:");
	               palabra = scanner.nextLine().toLowerCase();
	               String vocales = "aeiou";
                break;
	           case 3:
	        	   System.out.println("\nEjercicio 3: Introduce una frase:");
	               String frase = scanner.nextLine();
                break;
	           case 4:
	        	   System.out.println("\nEjercicio 4: Introduce una frase para mostrarla al inverso:");
	               String frasei = scanner.nextLine();
                 break;
	           case 5:
	        	   System.out.println("\nEjercicio 5: Introduce una palabra o frase:");
	               frase = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");
                 break;
	           case 6:
                salir=true;
                break;
	           default:
                System.out.println("Solo números entre 1 y 6");
	           
	           		}
	       }       

        
        

	}

}
