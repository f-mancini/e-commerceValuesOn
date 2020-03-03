package model;

public class Prodotto {
	private String descrizione;
	private int idProdotto;
	
	
    public Prodotto(String descrizione, int idProdotto) {
		super();
		this.descrizione = descrizione;
		this.idProdotto = idProdotto;
		
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

}
