<html>
<body>
<h2>Voilà une application Web Jee</h2>
<p> déployée sur la cible de déploiement construite par le provionner d'infrastrusture:</p>
<p><a href="https://github.com/Jean-Baptiste-Lasselle/lauriane">github-repo</a></p>

<p>Nous avons de plus déployé un</p>
<p>Datasource avec cette application Web, via</p>
<p> son descripteur de déploment "<a>WEB-INF/web.xml</a>"</p>
<p> son descripteur de déploment "<a>META-INF/web.xml</a>"</p>
<!-- Et plus tard -->
<!-- <p>Enfin, cette application web fait usage de JPA pour persister ses données dans une BDD, via ce datasource:</p> -->
<!-- <p> Sa configuration JPA "<a>META-INF/persistence.xml</a>"</p> -->


<h2>Je vérifie de plus</h2>
<p>Que les re-déploiements sont bien effectifs au simple changement de code source de l'application, sans changer le numéro de version dans le pom.xml</p>
<p>Aucun doute,c'est bien le dernier déploiement:</p>
<p>
version: 1.0.3-SNAPSHOT
</p>



<a href="./tests-datasource.jsp">Une page de test du datasource utilisé par cette application (re-déployé)</a>

<h2>Pour provoquer des exceptiosn au choix (re-déployé)</h2>

<ul>

<li><a href="./provocateur.jsp">Provocation no.1: NullPointer Exception</a></li>

<h2>Utilisation et appels jdbc purs qui fonctionnent</h2>
<li><a href="./Provocation">Une servlet qui fait réfénrenceJNDI au datasource configuré "jdbc/organisactionDS2" dans le "META-INF/context.xml" de l'application web (présent dans le *.war)</a></li>

<!-- <li><a href="/test-pur-jdbc.jsp">Provocation no.3: une jsp qui fait un pur appel JDBC</a></li> -->
<li><a href="./enfin.jsp">Une jsp qui fait un pur appel JDBC </a></li>

<li><a href="./test-jndi-jdbc.jsp">Une servlet qui récupère une référence sur le Datasource "jdbc/organisactionDS2", puis fait un appel SQL via le datasource</a></li>

<h2>Utilisation du datasource configuré niveau serveur (fonctionnent)</h2>

<li><a href="./tests-datasource-niveau-serveur.jsp">Une JSP qui exécute une méthode récupérant uen référence JNDI du datasource configuré niveau serveur "jdbc/organisactionDS3", puis fait un appel SQL via le datasource</a></li>



</ul>

</body>
</html>
