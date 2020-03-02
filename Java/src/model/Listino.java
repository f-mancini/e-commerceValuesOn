package model;

import java.util.List;

public class Listino {
	private Long idListino;
	private String dataInizio;
	private String dataFine;
	private List<Prodotto> listino;	
	
	public Listino() {
	}

	public Listino(Long idListino, String dataInizio, String dataFine, List<Prodotto> listino) {
		super();
		this.idListino = idListino;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.listino = listino;
	}

	public Long getIdListino() {
		return idListino;
	}
	
	public void setIdListino(Long idListino) {
		this.idListino = idListino;
	}
	
	public String getDataInizio() {
		return dataInizio;
	}
	
	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}
	
	public String getDataFine() {
		return dataFine;
	}
	
	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}
	
	public List<Prodotto> getListino() {
		return listino;
	}
	
	public void setListino(List<Prodotto> listino) {
		this.listino = listino;
	}
	
	
}
