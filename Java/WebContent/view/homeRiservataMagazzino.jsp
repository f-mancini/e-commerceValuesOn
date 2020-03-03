<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
div {
  margin-top: 10px;
  margin-bottom: 50px;
  margin-right: 150px;
  margin-left: 10px;
}
</style>
<meta charset="ISO-8859-1">
<title>HomeRiservataMagazzino</title>
</head>
<body>
	<div>
		<h1>Benvenuto</h1>
		<div align="right">
			<button type="button" onclick="location.href = 'homePubblica.jsp'">Logout</button>
		</div>
		<br> 
		<div align="center">
			<button type="button" onclick="location.href = 'gestioneMagazzino.jsp'">Gestione Magazzino</button>
			&nbsp;
			<button type="button" onclick="location.href='gestioneOrdine.jsp'">Gestione Ordini</button>
		</div>
	</div>
</body>

</html>