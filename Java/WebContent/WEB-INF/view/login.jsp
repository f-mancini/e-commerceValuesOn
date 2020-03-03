<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
font-family: Times New Roman;
text-align:center;
}
label{
color:black;
}
div {
background-color:blue;
}
h1{
color:white;
}

a{
color:darkblue;
}

a.titolo{
color:white;
text-decoration: none;
}
form{
border: solid 1px black;
}
</style>
<body>
<div>
<a class= "titolo" href="http://localhost:8080/e-commerce/home-pubblica.jsp"> ValueSport!</h1>
</div>
<form>
<br><br>
<label>Username</label><br><br>
<input type = "text" placeholder="Inserisci username"><br><br>
<label>Password</label><br><br>
<input type = "text" placeholder="Inserisci password"> <br><br>
<a href="http://localhost:8080/e-commerceSport/password-dimenticata.jsp">Password dimenticata?</a><br><br>
</form>
<br><br>
<input type = "button" value="Login" onclick="login()"> &nbsp;
<input type = "button" value="Annulla" (click)=""><br><br>

</body>
</html>