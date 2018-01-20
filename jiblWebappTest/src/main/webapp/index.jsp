<html>
<body>
<h2>Voilà une application Web Jee déployée asur la cible de déploiement!</h2>

<p>Nous allons de plus déployer un</p>
<p>Datasource avec cette application Web, via</p>
<p> son descripteur de déploment "<a>WEB-INF/web.xml</a>"</p>

<h2>Je vérifie de plus</h2>
<p>Que les re-déploiements sont bien effectifs au simple changement de code source de l'application, sans changer le numéro de version dans le pom.xml</p>
<p>Dernier ajout de paragraphe juste pour tests dernier déploiement</p>
<p>Aucun doute,c'est bien le dernier déploiement:</p>
<p>
version: 1.0.2-SNAPSHOT
</p>
<p>PADAAAAAAAAAAAAAAAAAAAm</p>
<p>témoin déploiement</p>


<a href="./tests-datasource.jsp">Une page de test du datasource utilisé par cette application (re-déployé)</a>

<h2>Pour provoquer des exceptiosn au choix (re-déployé)</h2>

<ul>

<li><a href="./provocateur.jsp">Provocation no.1: NullPointer Exception</a></li>

<h2>Utilisation et appels jdbc purs qui fonctionnent</h2>
<li><a href="./Provocation">Une servlet qui fait réfénrenceJNDI au datasource configuré "jdbc/organisactionDS2" dans le "META-INF/context.xml" de l'application web (présent dans le *.war)</a></li>

<!-- <li><a href="/test-pur-jdbc.jsp">Provocation no.3: une jsp qui fait un pur appel JDBC</a></li> -->
<li><a href="./enfin.jsp">Une jsp qui fait un pur appel JDBC </a></li>

<li><a href="./test-jndi-jdbc.jsp">Une servlet qui récupère une référence sur le Datasource "jdbc/organisactionDS2", puis fait un appel SQL via le datasource</a></li>



</ul>

</body>
</html>
