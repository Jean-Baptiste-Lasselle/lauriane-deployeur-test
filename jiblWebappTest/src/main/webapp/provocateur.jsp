<html>
<body>
<h2>Voilà un page provocatrice d'exceptions!</h2>


<h2>Pour provoquer l'exception NulPointerException</h2>

<p>Exception de type NullPointerException</p>
<%!
   private String provoquer(Object obj)
   {
	   obj.toString();
	   return "affichage de la méthode provocatrice";
   }
%>
<%=this.provoquer(null) %>
</body>
</html>
