package funciones;

import java.util.Scanner;

import com.curso.java.utils.Utilidades;
import com.curso.java.utils.UtilidadesMatematicas;

public class Comprobaciones {

	public static void main(String[] args) {
		// probar suma
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Escribe el primer numero a sumar:");
//	    int a = scanner.nextInt();
//	    
//	    System.out.println("Escribe el segundo numero a sumar:");
//	    int b = scanner.nextInt();
//	    
//	    int resultadodelaSuma = UtilidadesMatematicas.sumar(a, b);
//	    System.out.println("La suma de los dos numeros es: "+resultadodelaSuma);
	    
	    
	    //Probar operaciones		
//		double resultadoOperacion = UtilidadesMatematicas.operacion(12, 2, "+");
//		System.out.println(resultadoOperacion);
		
		
		
	    //calculo sumario
//	    double resultadodelaOperacion = (double) UtilidadesMatematicas.operacion("introduce los nuemros");
//	    System.out.println("El resultado de la operacion es: "+resultadodelaOperacion);
		
		int[] numeros = {1,2,3,4,5};
//		int resultadoSumatorio = UtilidadesMatematicas.calculaSumatorio(numeros);
//		System.out.println(resultadoSumatorio);

		
		
		//calculo media
		double resultadoMedia = UtilidadesMatematicas.calcularMedia(numeros);
        System.out.println("Media: " + resultadoMedia);
		
	}
	

}
