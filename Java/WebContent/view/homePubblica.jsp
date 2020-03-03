<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h2>Benvenuto nel Ecommerce!</h2>
<br>
<button onClick="location.href= 'carrello.jsp'">Visualizza carrello</button>
&nbsp;

  <button onClick="location.href= 'login.jsp'">Login</button>

<br>
<br>
<hr>
<br>
<input type="text" placeholder="cerca articolo"> &nbsp;
<!--  <input type="submit" value="cerca"> &nbsp; -->

<button (click)="cerca(0)">Cerca</button>
<br>
<br>
<hr>

  <table>
    <tr>
      <th>Codice</th>
      <th>Descrizione</th>
      <th>Prezzo</th>
      <th>Aggiungi al carrello</th>
    </tr>
      
    <tr>
      <td> codice</td>
      <td> descrizione</td>
      <td> prezzo</td>
      <td><input type="submit" value="Aggiungi al carello"> &nbsp;</td>
    </tr>  
  </table>


</body>
</html>