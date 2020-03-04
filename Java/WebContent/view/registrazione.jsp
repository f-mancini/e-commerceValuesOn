<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.ListaUtenti"%>
<%@page import="model.Utente"%>
<jsp:useBean id="lista" scope="session" class="model.ListaUtenti"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>

<form action ='registrati.do' method='post'>
<label >Nome</label><br>
  <input type="text" placeholder="Nome"><br><br>
 
  <label >Cognome</label><br>
  <input type="text" placeholder="Cognome"><br><br>
 
  <label >E-mail</label><br>
  <input type="text" placeholder="E-mail"><br><br>
 
    <label >Password</label><br>
  <input type="password" placeholder="Password"><br><br>
 
  <label >Conferma password</label><br>
  <input type="password" placeholder="Conferma password"><br><br>
  
  <p>Eventuale messaggio di errore relativo ai campi!</p>
  
    <input type="submit" value="Conferma" onclick="location.href='homeRiservata.jsp'"> 
    <input type="submit" value="Annulla" onclick="location.href='homePubblica.jsp'">
    
    <%
    for(Utente utente : lista.getLista()){
    	String campo1 = "<input type='text' name ='nome' value='"+utente.getNome()+"'>";
        String campo2 = "<input type='text' name ='cognome'  value='"+utente.getCognome()+"'>";
        String campo3 = "<input type='text' name ='username' value='"+utente.getUsername()+"'>";
        String campo4 = "<input type='text' name ='password' value='"+utente.getPassword()+"'>";
        String campo5 = "<input type='text' name ='mail' value='"+utente.getMail()+"'>";
        
        out.println("</form>");
    }
    %>
    </form>
</body>
</html>