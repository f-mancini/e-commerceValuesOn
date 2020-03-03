<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
div {
  margin-top: 10px;
  margin-bottom: 50px;
  margin-right: 500px;
  margin-left: 10px;
}
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}
</style>
<title>GestioneOrdini</title>
</head>
<body>
<h1>Gestione Ordini</h1>
<input type="text" name="cerca">
<button type="button">Cerca</button>
<div align="right">
			<button type="button" onclick="location.href = 'homeRiservataMagazzino.jsp'">Indietro</button>
			&nbsp;
			<button type="button" onclick="location.href = 'homePubblica.jsp'">Logout</button>
		</div>
&nbsp; &nbsp;
<br><br>
<input type="text" name="ordine">
<button type="button">Invia</button><br><br>
<table style="width: 60%">
		<tr>
			<th>Id Ordine</th>
			<th>Stato</th>
			<th>Data Spedizione</th>
			<th>Costo</th>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
</body>
</html>