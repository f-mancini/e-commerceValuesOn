package model;

import java.util.ArrayList;
import java.util.List;

public class ListaListini {
	List<Listino> listaListini = new ArrayList<>();
	
	public ListaListini() {
	}

	public ListaListini(List<Listino> listaListini) {
		this.listaListini = listaListini;
	}

	public List<Listino> getListaListini() {
		return listaListini;
	}

	public void setListaListini(List<Listino> listaListini) {
		this.listaListini = listaListini;
	}
	
}
