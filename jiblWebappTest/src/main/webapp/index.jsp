<html>
<body>
<h2>Voil� une application Web Jee d�ploy�e asur la cible de d�ploiement!</h2>

<p>Nous allons de plus d�ployer un</p>
<p>Datasource avec cette application Web, via</p>
<p> son descripteur de d�ploment "<a>WEB-INF/web.xml</a>"</p>

<h2>Je v�rifie de plus</h2>
<p>Que les re-d�ploiements sont bien effectifs au simple changement de code source de l'application, sans changer le num�ro de version dans le pom.xml</p>
<p>Dernier ajout de paragraphe juste pour tests dernier d�ploiement</p>
<p>Aucun doute,c'est bien le dernier d�ploiement:</p>
<p>
version: 1.0.2-SNAPSHOT
</p>
<p>PADAAAAAAAAAAAAAAAAAAAm</p>
<p>t�moin d�ploiement</p>


<a href="./tests-datasource.jsp">Une page de test du datasource utilis� par cette application (re-d�ploy�)</a>

<h2>Pour provoquer des exceptiosn au choix (re-d�ploy�)</h2>

<ul>

<li><a href="./provocateur.jsp">Provocation no.1: NullPointer Exception</a></li>

<h2>Utilisation et appels jdbc purs qui fonctionnent</h2>
<li><a href="./Provocation">Une servlet qui fait r�f�nrenceJNDI au datasource configur� "jdbc/organisactionDS2" dans le "META-INF/context.xml" de l'application web (pr�sent dans le *.war)</a></li>

<!-- <li><a href="/test-pur-jdbc.jsp">Provocation no.3: une jsp qui fait un pur appel JDBC</a></li> -->
<li><a href="./enfin.jsp">Une jsp qui fait un pur appel JDBC </a></li>

<li><a href="./test-jndi-jdbc.jsp">Une servlet qui r�cup�re une r�f�rence sur le Datasource "jdbc/organisactionDS2", puis fait un appel SQL via le datasource</a></li>



</ul>

</body>
</html>
