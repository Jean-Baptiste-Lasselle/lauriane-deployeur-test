<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="deri"%>

<%-- <sql:query var="exemple1deselectionsql" dataSource="organisaction/SourceDeDonnees">SELECT nom, prenom, age, email, username FROM bdd_organisaction.membresassoc; </sql:query> --%>
<%-- <sql:query var="exemple1deselectionsql" dataSource="jdbc/organisactionDS2">SELECT nom, prenom, age, email, username FROM bdd_organisaction.membresassoc; </sql:query> --%>
<%-- <sql:query var="exemple1deselectionsql" dataSource="java:comp/env/jdbc/organisactionDS2">SELECT nom, prenom, age, email, username FROM bdd_organisaction.membresassoc; </sql:query> --%>

<html>
<head>
<title>Tests du DataSource Jee organisaction</title>
</head>
<body>
	<h1>Cette page permet de réaliser un certain nombre de tests du
		DataSource</h1>

	<h2>Test 1.</h2>

	<p>Nous allons lister les enregistrements de la table</p>

	<!--  <table style="width:100%"> -->

	<!--   <tr> -->
	<!--     <th>Prénom</th> -->
	<!--     <th>Nom</th> -->
	<!--     <th>Âge</th> -->
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
<!-- 	<p>traitement test transparent</p> -->
	<%-- 	<sql:setDataSource var="srcDeDonneesJibl" --%>
	<%-- 		driver="org.mariadb.jdbc.Driver" --%>
	<%-- 		url="jdbc:mariadb://192.168.1.149:8456/bdd_organisaction" user="root" --%>
	<%-- 		password="peuimporte" /> --%>

	<%-- 	<sql:query dataSource="${srcDeDonneesJibl}" --%>
	<%-- 		var="enregistrementsRetournes"> --%>
	<!--             SELECT * from bdd_organisaction.membresassoc; -->
	<%--          </sql:query> --%>


	<p>Données (nom table seule):</p>
<%-- 	<sql:query var="donneesrecues"	dataSource="jdbc/organisactionDS2">SELECT nom, prenom, age, email, username FROM bdd_organisaction.membresassoc; </sql:query> --%>
	<sql:query var="donneesrecues"	dataSource="jdbc/organisactionDS2">SELECT nom, prenom, age, email, username FROM membresassoc; </sql:query>
	
		


	<h4>Tableau de données - out</h4>

	<table style="width: 100%">
		<tr>
			<th>Prénom</th>
			<th>Nom</th>
			<th>Âge</th>
			<th>Email</th>
			<th>Username</th>
		</tr>

		<deri:forEach var="enregistrementdetable" items="${donneesrecues.rows}">
			<tr>
				<td><deri:out value="${enregistrementdetable.nom}" /></td>
				<td><deri:out value="${enregistrementdetable.prenom}" /></td>
				<td><deri:out value="${enregistrementdetable.age}" /></td>
				<td><deri:out value="${enregistrementdetable.email}" /></td>
				<td><deri:out value="${enregistrementdetable.username}" /></td>
			</tr>
		</deri:forEach>
	</table>

	<p>--</p>

	<h2>Test 2.</h2>
	<p>TODO</p>

</body>
</html>
