package model;

import java.util.ArrayList;

public class ListaUtenti {
    ArrayList<Utente> lista = null;
    
    public ListaUtenti() {
    	lista = new ArrayList();
    }

	public ListaUtenti(ArrayList<Utente> lista) {
		super();
		this.lista = lista;
	}

	public ArrayList<Utente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Utente> lista) {
		this.lista = lista;
	}
	
	public void aggiungi(Utente utente) {
		lista.add(utente);
	}
	
    
    
}
