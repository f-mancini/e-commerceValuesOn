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
<title>Gestione Listini</title>
</head>
<body>
	<div>
		<h1>Gestione Listini</h1>
		<button type = "button" onclick = "location.href = 'creazioneListini.jsp'">Crea Listino</button> &nbsp;	
	</div>
	<br>
	<br>
	<br>
		<select id = "listino" size = "listini[]">
			<option>
				
			</option>
		</select>
		<button type = "button" onclick = "location.href = 'modificaListini.jsp'">Modifica listino selezionato</button>
	
</body>
</html>