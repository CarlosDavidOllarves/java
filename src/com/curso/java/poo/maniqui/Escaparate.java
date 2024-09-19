package com.curso.java.poo.maniqui;

public class Escaparate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Botones
		Boton boton = new Boton("redondo", "azul", 1);
		Boton[] botonesCamisa = { new Boton("cuadrado", "Blanco", 1.0), new Boton("cuadrado", "Blanco", 1.0),
				new Boton("redondodo", "Blanco", 1.0) };

		// prendas
		Pantalon pantalon = new Pantalon("azul", "M", 25, boton);
		Camisa camisa = new Camisa("azul", "l", 30, botonesCamisa);
		Vestido vestido = new Vestido("amarillo", "m", 30);
		Vestido vestido1 = new Vestido("rojo", "s", 20);

		// maniqui vestidos
		Maniqui maniqui1 = new Maniqui(1, vestido, null, null);
		Maniqui maniqui2 = new Maniqui(2, null, pantalon, camisa);
		Maniqui maniqui3 = new Maniqui(3,null,null,null);
		// escaparate
		Maniqui[] maniquis = { maniqui1, maniqui2 };
		System.out.println("Escaparate");
		for (Maniqui maniqui : maniquis) {
			if (maniqui.getVestido() != null) {
				System.out.println("Vestido - Color: " + maniqui.getVestido().getColor());
			}
			if (maniqui.getPantalon() != null) {
				System.out.println("Pantalon - Color: " + maniqui.getPantalon().getColor());
			}
			if (maniqui.getCamisa() != null) {
				System.out.println("Camisa - Color: " + maniqui.getCamisa().getColor());
			}
			
		}
		maniqui1.desvestir();
		System.out.println("Maniqui desnudo");
		System.out.println(maniqui3);
		
		//Vestir con vestido
		maniqui3.vestir(vestido,null,null);
		System.out.println("Maniqui con vestido");
		System.out.println(maniqui3);
	}
}

