package model;

public class MagazzinoProdotto {

	private int idMagazzino;
	private int idProdotto;
	private int quantita;

	public MagazzinoProdotto() {
	}

	public MagazzinoProdotto(int idMagazzino, int idProdotto, int quantita) {
		super();
		this.idMagazzino = idMagazzino;
		this.idProdotto = idProdotto;
		this.quantita = quantita;
	}

	public int getIdMagazzino() {
		return idMagazzino;
	}

	public void setIdMagazzino(int idMagazzino) {
		this.idMagazzino = idMagazzino;
	}

	public int getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

}
