<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <sql:query var="exemple1deselectionsql" dataSource="organisaction/SourceDeDonnees">SELECT nom, prenom, age, email, username FROM bdd_organisaction.membresassoc; </sql:query> --%>
<%-- <sql:query var="exemple1deselectionsql" dataSource="jdbc/organisactionDS2">SELECT nom, prenom, age, email, username FROM bdd_organisaction.membresassoc; </sql:query> --%>
<sql:query var="exemple1deselectionsql" dataSource="jdbc/organisactionDS">SELECT nom, prenom, age, email, username FROM bdd_organisaction.membresassoc; </sql:query>


<html>
<head>
<title>Tests du DataSource Jee organisaction</title>
</head>
<body>
<h1>Cette page permet de r�aliserr un certain nombre de tests du DataSource</h1>

<h2>Test 1.</h2>

<p>Nous allons lister les enregistrements de la table </p>

<!--  <table style="width:100%"> -->

<!--   <tr> -->
<!--     <th>Pr�nom</th> -->
<!--     <th>Nom</th> -->
<!--     <th>�ge</th> -->
<!--     <th>Email</th>     -->
<!--   </tr> -->

<!--   <tr> -->
<!--     <td>Jill</td> -->
<!--     <td>Smith</td> -->
<!--     <td>50</td> -->
<!--     <td>jill-smith@organisaction.org</td> -->
<!--   </tr> -->

<!--   <tr> -->
<!--     <td>Eve</td> -->
<!--     <td>Jackson</td> -->
<!--     <td>94</td> -->
<!--     <td>eve-jackson@organisaction.org</td> -->
<!--   </tr> -->
<!-- </table>  -->

<p>donn�es:</p>

<table style="width:100%">
  <tr>
    <th>Pr�nom</th>
    <th>Nom</th>
    <th>�ge</th>
    <th>Email</th>
    <th>Username</th>    
  </tr>
<c:forEach var="enregistrementdetable" items="${exemple1deselectionsql.rows}">
  <tr>
    <td>${enregistrementdetable.prenom}</td>
    <td>${enregistrementdetable.nom}</td>
    <td>${enregistrementdetable.age}</td>
    <td>${enregistrementdetable.email}</td>
    <td>${enregistrementdetable.username}</td>
    
  </tr>
  
<%--     Foo ${enregistrementdetable.prenom}<br/> --%>
<%--     Bar ${enregistrementdetable.nom}<br/> --%>
<%--     Bar ${enregistrementdetable.age}<br/> --%>
<%--     Bar ${enregistrementdetable.email}<br/> --%>
    
</c:forEach>
</table>

<p> -- </p>

<h2>Test 2.</h2>
<p>ccc</p>

</body>
</html>
