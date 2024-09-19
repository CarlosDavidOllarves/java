package com.curso.java.inicio.bucles;
import java.util.Scanner;
public class Ruleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        //Random random = new Random();
        int saldo = 500;
        boolean seguirJugando = true;

        while (seguirJugando && saldo > 0) {
            int numeroApostado = -1;
            while (numeroApostado < 0 || numeroApostado > 36) {
                System.out.print("¿Por cual número quieres apostar? (0-36): ");
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

            if (saldo > 0) {
                System.out.print("¿Quieres seguir jugando? (si/no): ");
                seguirJugando = scanner.next().equalsIgnoreCase("si");
            } else {
                System.out.println("Te has quedado sin dinero.");
                seguirJugando = false;
            }
        }

        System.out.println("Te vas con un saldo de: " + saldo);
        

	}

}
