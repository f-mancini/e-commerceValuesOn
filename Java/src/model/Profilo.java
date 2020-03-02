package model;

public class Profilo {
	Long idProfilo;
	String ruolo;
	
	public Profilo() {
	}

	public Profilo(Long idProfilo, String ruolo) {
		super();
		this.idProfilo = idProfilo;
		this.ruolo = ruolo;
	}
	
	public Long getIdProfilo() {
		return idProfilo;
	}
	
	public void setIdProfilo(Long idProfilo) {
		this.idProfilo = idProfilo;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	
}
