<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1256">
    <title>Ajouter un Membre</title>
</head>
<body>
<form action="saveMembre" method="post">
<pre>
nom : <input type="text" name="nomMembre">
    prenom : <input type="text" name="prenomMembre">
numero de telephone : <input type="text" name="telMembre">
    email : <input type="email" name="emailMembre">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeMembre">Liste des Membres</a>
</body>
</html>
