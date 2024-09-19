package com.curso.java.utils;

public class UtilidadesMatematicas {
	//funcion sumar le paso 2 parametros y devuelve la suma
	
	public static int sumar (int a, int b) {
		return a + b;
	}
	
//	funcion operacion, le vamos a pasar tres parametros, los dos primeros son numeros y el tercero es la operacion que queremos 
//	hacer con los números. Me devolverá el resultado de la operación
	
	public static double operacion(double num1, double num2 , String operacion) {
		double resultado = 0;
		
//		if (operacion.equals("suma") || operacion.equals("+")) {
//			resultado = num1 + num2;
//		}else if(operacion.equals("resta") || operacion.equals("-")) {
//			resultado = num1 - num2;
//		}else if(operacion.equals("multiplica") || operacion.equals("*")) {
//			resultado = num1 * num2;
//		}else if(operacion.equals("divide") || operacion.equals("/")) {
//			resultado = num1 / num2;
//		}
		
		switch(operacion) {
			case "suma":
			case "+": resultado = num1 + num2;break;
			case "-": resultado = num1 - num2;break;
			case "*": resultado = num1 * num2;break;
			case "/": resultado = num1 / num2;break;
		}
		
		return resultado;
	}
//	funcion calculaSumatorio que le pasamos un [] de enteros y me devuelve la suma de todos los numeros

	public static int calculaSumatorio (int[] numeros) {
		int suma = 0;
		for (int numero : numeros) {
        	suma += numero;
	}
		return suma;
    }

//	funcion calcularMedia que le pasamos un [] de enteros, que llama a la función calculaSumatorio para 
//	realizar el cálculo y devuelve la media de todos los numeros del array.
	
	public static double calcularMedia(int[] numeros) {
	    if (numeros.length == 0) {
	        return 0;
	    }
	    int sumatorio = calculaSumatorio(numeros);
	    return (double) sumatorio / numeros.length;
	}
		
	}


