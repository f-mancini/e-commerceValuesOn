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
form{border-color:grey;}
a{
color:darkblue;

}

a.titolo{
color:darkblue;
text-decoration: none;
}
form{
border: solid 1px black;
}
</style>
<body>
<a class ="titolo" href ="http//localhost:8080/e-commerceSport/">ValueSport!</a><br><br>
<form>
<label >Username</label><br>
  <input type="text" placeholder="Inserisci username"><br><br>
  <label >Password</label><br>
  <input type="text" placeholder="Inserisci password"><br><br>
  <a href="http://localhost:8080/e-commerceSport/view/passwordDimenticata.jsp">Password dimenticata?</a>
  </form>
</body>
</html>