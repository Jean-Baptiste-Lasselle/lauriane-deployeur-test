<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
     <%@ page import="couche.acces.donnees.TestsJDBC" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tests Accès JDBC pur (sans JNDI)</title>
</head>
<body>
<h2>Tests Accès JDBC pur (sans JNDI)</h2>

<%!
public String ebeing() throws SQLException {
	System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> OUI JIBL DANS LE CODE");
	System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> OUI JIBL DANS LE CODE");
	System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> OUI JIBL DANS LE CODE");
	
	Connection connection = null;
	
	try {
		connection = DriverManager.getConnection("jdbc:mariadb://192.168.1.149:8456/bdd_organisaction?user=root&password=peuimporte");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		throw e;
	}
	
	Statement st = null;
	
	try {
		st = connection.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw e;
	}
	
	ResultSet resultats= null;
	try {
		resultats = st.executeQuery("SELECT * FROM membresassoc");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw e;
	}
	// 2ventuellement construire des objets à renvoyer comme résultat du SELECT
	try {
		st.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw e;
	}
	
	try {
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw e;
	}
	
	return "Une connexion JDBC a été correctement établie par ebeing()";
}

%>

<h3>donc ici appel [ebeing()] </h3>
<%=this.ebeing() %>

<h3>donc ici appel [couche.acces.donnees.TestsJDBC.test1()*] </h3>
<%=couche.acces.donnees.TestsJDBC.test1() %>

<h3>donc ici appel [couche.acces.donnees.TestsJDBC.verifValeurProprieteCOnfSLF4J()**] </h3>
<%=couche.acces.donnees.TestsJDBC.verifValeurProprieteCOnfSLF4J() %>
</body>
</html>