<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Liste Membre</title>
</head>
<body>
<h1 >
    Liste des Membre
</h1>
<table >
    <tr>
        <th>ID</th><th>Nom</th><th>prenom</th><th>numero de téléphone</th> <th>email</th><th>Suppression<th>Edition</th>
    </tr>
    <c:forEach items="${membre}" var="m">
        <tr>
            <td>${m.idMembre}</td>
            <td>${m.nomMembre}</td>
            <td>${m.prenomMembre}</td>
            <td>${m.telMembre}</td>
            <td>${m.emailMembre}</td>
            <td><a onclick="return confirm('Etes-vous sûr ?')"
                   href="supprimerMembre?id=${m.idMembre }">Supprimer</a></td>
            <td><a href="modifierMembre?id=${m.idMembre }">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
