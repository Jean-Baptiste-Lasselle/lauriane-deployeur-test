<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="couche.acces.donnees.TestsJDBC" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Datasource configuré au niveau serveur</title>
</head>
<body>

<h3>Test d'accès au datasource configuré au niveau du serveur:</h3>

<h4>Configuration:</h4>

<ul>
<li> [/usr/local/tomcat/conf/server.xml] :  une balise "Resource" juste sous la balise "GlobalNamingResources" </li>
<li> [RACINE_FICHIER_WAR/META-INF/context.xml] :  une balise "ResourceLink" référençant le même nom JNDI </li>
<li> [RACINE_FICHIER_WAR/WEB-INF/web.xml] :  une balise "resource-ref" référençant le même nom JNDI </li>
<!-- Et quand on utilisera JPA: -->
<!-- <li> [RACINE_FICHIER_WAR/META-INF/persistence.xml] :  une balise "non-jta-datasource" référençant le même nom JNDI </li> -->




</ul>
<h4>Données:</h4>
<%=couche.acces.donnees.TestsJDBC.test5() %>

</body>
</html>