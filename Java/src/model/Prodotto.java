package model;

public class Prodotto {
	private String descrizione;
	private int idProdotto;
	private double prezzo;
	private int quantit�;
	
    public Prodotto(String descrizione, int idProdotto, double prezzo, int quantit�) {
		super();
		this.descrizione = descrizione;
		this.idProdotto = idProdotto;
		this.prezzo = prezzo;
		this.quantit� = quantit�;
	}
	public Prodotto() {
		super();
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantit�() {
		return quantit�;
	}
	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}
}
