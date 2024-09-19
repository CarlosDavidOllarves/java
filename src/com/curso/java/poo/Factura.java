package com.curso.java.poo;

public class Factura {
	private String referencia;
	private String fecha;
	private double importe;
	

	public Factura(String referencia, String fecha, double importe) {
		this.referencia = referencia;
		this.fecha = fecha;
		this.importe = importe;
		}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}