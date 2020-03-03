package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="/ServletHomeRiservataMagazzino", urlPatterns = {"/homeriservatamagazzino.jsp"})
public class ServletHomeRiservataMagazzino extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        StringBuffer str = new StringBuffer(request.getServletPath());
        String comando = str.substring(1,str.lastIndexOf(".do"));
        String pagina ="";
        RequestDispatcher rd;
        ServletContext sc;
        
        switch(comando){
            case "logout":
               
                break;
            
            case "gestione magazzino":
            		
            	break;
            	
            case "gestione ordini":	
               
                break;                           
                              
        }
        sc = getServletContext();
        rd = sc.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}
