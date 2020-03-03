package model;

public class Magazzino {
	private int idMagazzino;
	private int indirizzo;
	
	
	public Magazzino() {
	}
	
	public Magazzino(int idMagazzino, int indirizzo) {
		super();
		this.idMagazzino = idMagazzino;
		this.indirizzo = indirizzo;
	}

	public int getIdMagazzino() {
		return idMagazzino;
	}
	public void setIdMagazzino(int idMagazzino) {
		this.idMagazzino = idMagazzino;
	}
	public int getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(int indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	
}
