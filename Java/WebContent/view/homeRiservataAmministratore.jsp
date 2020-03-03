<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home riservata amministratore</title>
</head>
<body>
	<input type="text" name="searchKey" placeholder="Cerca">
	<input type="button" value="Vai" onclick="cerca()">
	
	<form action="aggiungi.do" method="post">
		<input type="text" name="username" placeholder="Username">
		<input type="text" name="name" placeholder="Nome">
		<input type="text" name="surname" placeholder="Cognome">
		<input type="submit" value="Aggiungi amministratore">
		<input type="submit" value="Aggiungi buyer">
		<input type="submit" value="Aggiungi magazziniere">
	</form>
	<ul>
		<li>Username</li>
		<li>Nome</li>
		<li>Cognome</li>
		<li>Amministratore</li>
		<li>Buyer</li>
		<li>Magazziniere</li>
	</ul>
</body>
</html>