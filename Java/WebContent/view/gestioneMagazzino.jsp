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
	margin-right: 200px;
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
<title>Gestione Magazzino</title>
</head>
<body>
	<div>
		<h1>Gestione Magazzino</h1>
		<input type="text" name="cerca">
		<button type="button">Cerca</button>

		<div align="right">
			<button type="button" onclick="location.href ='homeRiservataMagazzino.jsp'">Indietro</button>&nbsp;
			<button type="button" onclick="location.href ='homePubblica.jsp'">Logout</button>
		</div>
		<br> <br>
		<button type="button">Inserisci</button>
		<button type="button">Modifica</button>
		<button type="button">Rimuovi</button>
		<table style="width: 60%">
			<br>
			<br>
			<tr>
				<th>Id Magazzino</th>
				<th>Descrizione</th>
				<th>Id Prodotto</th>
				<th>Prezzo</th>
				<th>Quantità</th>
			</tr>
			<tr>
				<td></td>
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
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div>
</body>
</html>