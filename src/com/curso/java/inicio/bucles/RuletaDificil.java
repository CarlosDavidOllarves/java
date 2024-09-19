package com.curso.java.inicio.bucles;
import java.util.Scanner;

public class RuletaDificil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int saldo = 500;
		boolean seguirJugando = true;
		
		while (seguirJugando && saldo > 0) {
            System.out.println("================================");
            System.out.println("Menú de apuestas:");
            System.out.println("1. Apostar por número");
            System.out.println("2. Apostar por par/impar");
            System.out.println("3. Apostar por bloques");
            System.out.println("4. Salir");
            System.out.println("================================");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
            case 1: // Apostar por número
                int numeroApostado = -1;
                while (numeroApostado < 0 || numeroApostado > 36) {
                    System.out.print("¿Por qué número quieres apostar? (0-36): ");
                    numeroApostado = scanner.nextInt();
                }

                int cantidadApostada = 0;
                while (cantidadApostada <= 0 || cantidadApostada > saldo) {
                    System.out.print("¿Cuánto dinero quieres apostar?: ");
                    cantidadApostada = scanner.nextInt();
                    if (cantidadApostada > saldo) {
                        System.out.println("No puedes apostar más de tu saldo disponible.");
                    }
                }

                int numeroAleatorio = (int)(Math.random()*36)+1;
                System.out.println("Número aleatorio: " + numeroAleatorio);

                if (numeroApostado == numeroAleatorio) {
                    saldo += cantidadApostada * 36;
                    System.out.println("¡Has ganado! Tu saldo ahora es: " + saldo);
                } else {
                    saldo -= cantidadApostada;
                    System.out.println("Has perdido. Tu saldo ahora es: " + saldo);
                }
                break;
             
            case 2: // Apostar por par/impar
                System.out.print("¿A qué quieres apostar? (par/impar): ");
                String tipoApuestaParImpar = scanner.next().toLowerCase();

                cantidadApostada = 0;
                while (cantidadApostada <= 0 || cantidadApostada > saldo) {
                    System.out.print("¿Cuánto dinero quieres apostar?: ");
                    cantidadApostada = scanner.nextInt();
                    if (cantidadApostada > saldo) {
                        System.out.println("No puedes apostar más de tu saldo disponible.");
                    }
                }

                int numeroAleatoriop = (int)(Math.random()*36)+1;
                System.out.println("Número aleatorio: " + numeroAleatoriop);

                boolean esPar = (numeroAleatoriop % 2 == 0);
                if ((tipoApuestaParImpar.equals("par") && esPar) || (tipoApuestaParImpar.equals("impar") && !esPar)) {
                    saldo += cantidadApostada * 2;
                    System.out.println("¡Has ganado! Tu saldo ahora es: " + saldo);
                } else {
                    saldo -= cantidadApostada;
                    System.out.println("Has perdido. Tu saldo ahora es: " + saldo);
                }
                break;
                
            case 3: // Apostar por bloques
                System.out.print("¿A cuál bloque quieres apostar? (1-12, 13-24, 25-36): ");
                int bloque = scanner.nextInt();

                cantidadApostada = 0;
                while (cantidadApostada <= 0 || cantidadApostada > saldo) {
                    System.out.print("¿Cuánto dinero quieres apostar?: ");
                    cantidadApostada = scanner.nextInt();
                    if (cantidadApostada > saldo) {
                        System.out.println("No puedes apostar más de tu saldo disponible.");
                    }
                }

                int numeroAleatoriob = (int)(Math.random()*36)+1;
                System.out.println("Número aleatorio: " + numeroAleatoriob);

                boolean ganaBloque = (bloque == 1 && numeroAleatoriob >= 1 && numeroAleatoriob <= 12) ||
                                     (bloque == 13 && numeroAleatoriob >= 13 && numeroAleatoriob <= 24) ||
                                     (bloque == 25 && numeroAleatoriob >= 25 && numeroAleatoriob <= 36);

                if (ganaBloque) {
                    saldo += cantidadApostada * 5;
                    System.out.println("¡Has ganado! Tu saldo ahora es: " + saldo);
                } else {
                    saldo -= cantidadApostada;
                    System.out.println("Has perdido. Tu saldo ahora es: " + saldo);
                }
                break;

            case 4: // Salir
                seguirJugando = false;
                break;

            default:
                System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                break;
        }

        if (saldo > 0 && seguirJugando) {
            System.out.print("¿Quieres seguir jugando? (si/no): ");
            seguirJugando = scanner.next().equalsIgnoreCase("si");
        } else if (saldo <= 0) {
            System.out.println("Te has quedado sin dinero.");
            seguirJugando = false;
        }
    }

    System.out.println("Te vas con un saldo de: " + saldo);
    
         
		
	}
}


