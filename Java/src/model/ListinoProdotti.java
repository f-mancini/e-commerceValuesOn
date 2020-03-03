package model;

public class ListinoProdotti {
	private int idListino;
	private int idProddotto;
	private double prezzo;
	
	public ListinoProdotti() {
		super();
	}
	public ListinoProdotti(int idListino, int idProddotto, double prezzo) {
		super();
		this.idListino = idListino;
		this.idProddotto = idProddotto;
		this.prezzo = prezzo;
	}
	public int getIdListino() {
		return idListino;
	}
	public void setIdListino(int idListino) {
		this.idListino = idListino;
	}
	public int getIdProddotto() {
		return idProddotto;
	}
	public void setIdProddotto(int idProddotto) {
		this.idProddotto = idProddotto;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}
