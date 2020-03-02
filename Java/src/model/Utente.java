package model;

public class Utente {
	private Long idUtente;
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String mail;
	
	public Utente() {
	}
	
	public Utente(Long idUtente, String nome, String cognome, String username, String password, String mail) {
		super();
		this.idUtente = idUtente;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.mail = mail;
	}
	public Long getIdUtente() {
		return idUtente;
	}
	
	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
