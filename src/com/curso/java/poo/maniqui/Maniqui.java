package com.curso.java.poo.maniqui;

import java.util.Scanner;

public class Maniqui {

	private int id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;

	public Maniqui(int id, Vestido vestido, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.vestido = vestido;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public Maniqui(int id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}

	public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	public void desvestir () {
		this.vestido=null;
		this.camisa=null;
		this.pantalon=null;
	}
	public void Vestir (Vestido vestido) {
		desvestir();
		this.vestido = vestido;
	}
	public void vestir(Pantalon pantalon, Camisa camisa) {
		desvestir();
		this.pantalon = pantalon;
		this.camisa = camisa;
	}
//	public void vestir(Vestido vestido, Pantalon pantalon, Camisa camisa) {
//		desvestir();
//		this.vestido = vestido;
//		this.pantalon = pantalon;
//		this.camisa = camisa;
//	}
		
}
