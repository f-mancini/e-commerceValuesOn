package model;


public class Listino {
	private Long idListino;
	private String dataInizio;
	private String dataFine;
	
	public Listino() {
	}

	public Listino(Long idListino, String dataInizio, String dataFine) {
		super();
		this.idListino = idListino;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
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
	
	
	
	
}
