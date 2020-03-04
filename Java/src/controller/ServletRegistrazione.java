package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Utente;
import model.dao.Eccezione;
import model.dao.RegistrazioneDao;
import model.ListaUtenti;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;


@WebServlet("ServletRegistrazione")
public class ServletRegistrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Eccezione {
        response.setContentType("text/html;charset=UTF-8");
        
        StringBuffer str = new StringBuffer(request.getServletPath());
        String comando = str.substring(1,str.lastIndexOf(".do"));
        String pagina ="";
        RequestDispatcher rd;
        ServletContext sc;
        
        switch(comando){
            case "registrati":
            	//prendo i parametri inseriti dell'utente nel form registrazione e creo l'oggetto utente
            	Long id = null;
            	String nome = request.getParameter("nome");
            	String cognome = request.getParameter("cognome");
            	String username = request.getParameter("username");
            	String password = request.getParameter("password");
            	String mail = request.getParameter("mail");
            	Utente utente = new Utente(id, nome, cognome, username, password, mail);
            	
            	//eseguo il metodo "registrati" della classe Registrazione.dao sull'utente, inserendolo nel db
            	RegistrazioneDao.registrati(utente);
            	
            	//aggiungo l'utente anche nella listaUtenti
            	ListaUtenti lista = RegistrazioneDao.lista(request); 
            	lista.aggiungi(utente);
            	
            	//Se la registrazione è andata a buon fine va a homeRiservata
            	pagina = "/homeRiservata.jsp";
               
                break;
            
            
       }
        sc = getServletContext();
        rd = sc.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}
