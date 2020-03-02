package model;

import java.time.LocalDate;

public class Ordine {
	
	private double costo;
	private LocalDate dataSpedizione;
	private int idCliente;
	private int idordine;
	private String stato;
	
	
	public Ordine() {
		super();
	}


	public Ordine(double costo, LocalDate dataSpedizione, int idCliente, int idordine, String stato) {
		super();
		this.costo = costo;
		this.dataSpedizione = dataSpedizione;
		this.idCliente = idCliente;
		this.idordine = idordine;
		this.stato = stato;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public LocalDate getDataSpedizione() {
		return dataSpedizione;
	}


	public void setDataSpedizione(LocalDate dataSpedizione) {
		this.dataSpedizione = dataSpedizione;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public int getIdordine() {
		return idordine;
	}


	public void setIdordine(int idordine) {
		this.idordine = idordine;
	}


	public String getStato() {
		return stato;
	}


	public void setStato(String stato) {
		this.stato = stato;
	}
	
	
	
}
