<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione amministratore</title>
</head>
<body>

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
  
    <input type="submit" value="Utente buyer &#x2714;">  <input type="submit" value="Utente magazziniere &#x2714;"> <br><br>
  
    <button onclick="location.href='homeRiservataAmministratore.jsp'">Comferma</button> <input type="submit" value="Annulla">
</body>
</html>