<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
text-align:center;
}
form{
border: solid 1px;
}
a.titolo{
color:darkblue;
text-decoration: none;
font-size: 30px;
}
</style>
</head>
<body>
<form>
<a class ="titolo" href ="http://localhost:8080/e-commerceSport/view/homePubblica.jsp">ValueSport!</a><br><br>
<label>Nuova password</label><br><br>
<input type = "password" placeholder="Password"><br><br>
<label>Conferma password</label><br><br>
<input type = "password" placeholder="Conferma password"> <br><br>
<input type = "button" value="Conferma" onclick="cambioPassword()"> &nbsp;
<input type = "button" value="Annulla" onclick="location.href='login.jsp'"><br><br>
</form>
</body>
</html>


