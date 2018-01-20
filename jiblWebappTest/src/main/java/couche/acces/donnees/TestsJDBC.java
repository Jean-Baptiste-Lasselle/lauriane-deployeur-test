package couche.acces.donnees;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */

/**
 * @author ezy
 *
 */
public class TestsJDBC {
	private static final Logger logger = LoggerFactory.getLogger(TestsJDBC.class);
	public static String verifValeurProprieteCOnfSLF4J()  {
		return System.getProperty("org.slf4j.simpleLogger.defaultLogLevel");
	}
	/**
	 * Test pur JDBC natif
	 * @throws SQLException 
	 */
	public static String test1() throws SQLException {
		System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> OUI JIBL DANS LE CODE");
		System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> OUI JIBL DANS LE CODE");
		System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> OUI JIBL DANS LE CODE");
		
		System.err.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> [ERREUR] OUI JIBL DANS LE CODE");
		System.err.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> [ERREUR] OUI JIBL DANS LE CODE");
		System.err.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> [ERREUR] OUI JIBL DANS LE CODE");
		
		logger.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> [ JIBL - SLF4J - INFO ] OUI JIBL DANS LE CODE");
		logger.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> [ JIBL - SLF4J - INFO ] OUI JIBL DANS LE CODE");
		logger.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> [ JIBL - SLF4J - INFO ] OUI JIBL DANS LE CODE");
		logger.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> [ JIBL - SLF4J - INFO ] OUI JIBL DANS LE CODE");
		
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mariadb://192.168.1.149:8456/bdd_organisaction?user=root&password=peuimporte");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
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
		return "Une connexion JDBC a été correctement établie par TestsJDBCtestr1()";
		
	}
	private static String URI_JNID_DS = "java:comp/env/jdbc/organisactionDS2";
//	private static String URI_JNID_DS = "jdbc/organisactionDS2";
//	private static String URI_JNID_DS = "jdbc/organisactionDS3";
//	private static String URI_JNID_DS = "java:comp/env/jdbc/organisactionDS3"; ==>> lève une exception enfiiinnn
//	private static String URI_JNID_DS = "jdbc/organisactionDS3";
	
	
	/**
	 * Avec celui là, je ferai un accès JNDI au datasource avec	
	 * 		initialContext
	 * 
	 * URI_JNID_DS
	 * @throws NamingException 
	 * @throws SQLException 
	 * 
	 */
	public static String test2() throws NamingException, SQLException {
		
		Context ctx = null;
		try {
			ctx = new InitialContext();
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			throw e1;
		}
		
		DataSource ds = null;
		try {
			ds =(DataSource)ctx.lookup(URI_JNID_DS);
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			throw e1;
		}
		
		Connection connection = null;
		
		try {
			connection = ds.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			throw e1;
		}
		
//		try {
//			connection = DriverManager.getConnection("jdbc:mariadb://192.168.1.149:8456/bdd_organisaction?user=root&password=peuimporte");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Statement st = null;
		
		try {
			st = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw e;
		}
		
		ResultSet resultats= null;
		try {
			st.executeQuery("SELECT * FROM membresassoc;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw e;
		}
		
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw e;
		}
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw e;
		}
		
		return "test2(): Une connexion a été coorectement établie en utlisant le DAtasource de JNDI: {" + URI_JNID_DS + "}";
		
		
	}

	
	
	/**
	 * Au dessus
	 */
	
	/**
	 * 
	 * @return la liste des données
	 * @throws NamingException
	 * @throws SQLException
	 */
	public static String test4() throws NamingException, SQLException {
		StringBuilder retour = new StringBuilder();
		Context ctx = null;
		try {
			ctx = new InitialContext();
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			throw e1;
		}
		
		DataSource ds = null;
		try {
			ds =(DataSource)ctx.lookup(URI_JNID_DS);
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			throw e1;
		}
		
		Connection connection = null;
		
		try {
			connection = ds.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			throw e1;
		}
		
//		try {
//			connection = DriverManager.getConnection("jdbc:mariadb://192.168.1.149:8456/bdd_organisaction?user=root&password=peuimporte");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Statement st = null;
		
		try {
			st = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw e;
		}
		
		ResultSet resultats= null;
		try {
			resultats= st.executeQuery("SELECT * FROM membresassoc;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw e;
		}
		
		
		
		while(resultats.next()) {
			retour.append("<ul>");
			retour.append("<li>");
			retour.append("Prénom: ");
			retour.append(resultats.getString("prenom"));
			retour.append("</li>");
			retour.append("<li>");
			retour.append("Nom: ");
			retour.append(resultats.getString("nom"));
			retour.append("</li>");
			retour.append("<li>");
			retour.append("EMAIL: ");
			retour.append(resultats.getString("email"));
			retour.append("</li>");
			retour.append("<li>");
			retour.append("Utilisateur: ");
			retour.append(resultats.getString("username"));
			retour.append("</li>");
			retour.append("<li>");
			retour.append("Âge: ");
			retour.append(resultats.getInt("age"));
			retour.append("</li>");
			retour.append("</ul>");
		}
		
		
		/**
		 * Libération des ressources
		 */
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw e;
		}
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw e;
		}
		
		return "<p>test4(): Une connexion a été coorectement établie en utlisant le Datasource de JNDI: {" + URI_JNID_DS + "}</p>" + "<p>" + retour + "</p>";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Avec celui là, je ferai un accès JNDI au datasource avec	
	 * 		initialContext
	 * 
	 * 	"jdbc/organisactionDS"
	 * 
	 */
	public static void test3() {
		
		Context ctx = null;
		try {
			ctx = new InitialContext();
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		DataSource ds = null;
		try {
			ds =(DataSource)ctx.lookup("jdbc/organisactionDS");
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection connection = null;
		
		try {
			connection = ds.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		try {
//			connection = DriverManager.getConnection("jdbc:mariadb://192.168.1.149:8456/bdd_organisaction?user=root&password=peuimporte");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Statement st = null;
		
		try {
			st = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResultSet resultats= null;
		try {
			st.executeQuery("SELECT * FROM membresassoc");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
