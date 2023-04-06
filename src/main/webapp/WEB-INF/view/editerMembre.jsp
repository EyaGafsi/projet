<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1256">
    <title>Modifier un membre</title>
</head>
<body>
<form action="updateMembre" method="post">
<pre>
    <input type="hidden" name="idMembre" value="${membre.idMembre}">
nom : <input type="text" name="nomMembre" value="${membre.nomMembre}">
prenom :<input type="text" name="prenomMembre" value="${membre.prenomMembre}">
numero de telephone :<input type="text" name="telMembre" value="${membre.telMembre}">
email:<input type="text" name="emailMembre" value="${membre.emailMembre}">
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="ListeMembre">Liste membre</a>
</body>
</html>