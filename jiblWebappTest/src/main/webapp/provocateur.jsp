<html>
<body>
<h2>Voil� un page provocatrice d'exceptions!</h2>


<h2>Pour provoquer l'exception NulPointerException</h2>

<p>Exception de type NullPointerException</p>
<%!
   private String provoquer(Object obj)
   {
	   obj.toString();
	   return "affichage de la m�thode provocatrice";
   }
%>
<%=this.provoquer(null) %>
</body>
</html>
