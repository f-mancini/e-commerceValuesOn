package model;

public class OrdineProdotto {
	private int idOrdine;
	private int idProdotto;
	private String indirizzoSpedizione;
	
	public OrdineProdotto() {
	}

	public OrdineProdotto(int idOrdine, int idProdotto, String indirizzoSpedizione) {
		super();
		this.idOrdine = idOrdine;
		this.idProdotto = idProdotto;
		this.indirizzoSpedizione = indirizzoSpedizione;
	}

	public int getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}

	public int getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}

	public String getIndirizzoSpedizione() {
		return indirizzoSpedizione;
	}

	public void setIndirizzoSpedizione(String indirizzoSpedizione) {
		this.indirizzoSpedizione = indirizzoSpedizione;
	}
	
	
	
}
