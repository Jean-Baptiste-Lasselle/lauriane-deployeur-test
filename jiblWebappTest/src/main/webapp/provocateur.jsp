<%@page import="java.sql.SQLException"%>
<html>
<body>
<h2>Voil� un page provocatrice d'exceptions!</h2>


<h2>Pour provoquer l'exception NulPointerException</h2>

<p>Exception de type NullPointerException</p>
<%!
   private String provoquer(Object obj) throws SQLException
   {
	   if (obj == null)	throw new SQLException(" la raison de Jibl pour lever une exeption ", "Ouais l'�tat SQL de JIbl", 1);
// 	   obj.toString();
	   return "affichage de la m�thode provocatrice";
   }
%>
<%=this.provoquer(null) %>
</body>
</html>
