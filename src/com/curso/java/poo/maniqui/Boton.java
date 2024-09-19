package com.curso.java.poo.maniqui;

public class Boton {
	private String forma;
	private String color;
	private double tamanio;
	
	public Boton(String forma, String color, double tamanio) {
		super();
		this.forma = forma;
		this.color = color;
		this.tamanio = tamanio;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

}
