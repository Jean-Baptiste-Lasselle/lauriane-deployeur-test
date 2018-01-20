package gestion.exceptions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GestionnaireDexceptions
 * 
 */
public class GestionnaireDexceptions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionnaireDexceptions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Les informatiosn à propos de l'exception traitée, sont obtenue à l'aide des constantes définies:
	 * 
	 * https://tomcat.apache.org/tomcat-9.0-doc/servletapi/javax/servlet/RequestDispatcher.html
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
static java.lang.String 	ERROR_EXCEPTION
The name of the request attribute that should be set by the container when custom error-handling servlet or JSP page is invoked.

static java.lang.String 	ERROR_EXCEPTION_TYPE
The name of the request attribute that should be set by the container when custom error-handling servlet or JSP page is invoked.

static java.lang.String 	ERROR_MESSAGE
The name of the request attribute that should be set by the container when custom error-handling servlet or JSP page is invoked.

static java.lang.String 	ERROR_REQUEST_URI
The name of the request attribute that should be set by the container when custom error-handling servlet or JSP page is invoked.

static java.lang.String 	ERROR_SERVLET_NAME
The name of the request attribute that should be set by the container when custom error-handling servlet or JSP page is invoked.

static java.lang.String 	ERROR_STATUS_CODE
The name of the request attribute that should be set by the container when custom error-handling servlet or JSP page is invoked.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * et donc les valeurs de ces constantes donnent les noms d'attributs de requêtes HTTTP à utiliser pour récupérer les infos de cette exception
	 * 
	 * 
	 * 

public static final java.lang.String 	ERROR_EXCEPTION 		"javax.servlet.error.exception"
public static final java.lang.String 	ERROR_EXCEPTION_TYPE 	"javax.servlet.error.exception_type"
public static final java.lang.String 	ERROR_MESSAGE 			"javax.servlet.error.message"
public static final java.lang.String 	ERROR_REQUEST_URI 		"javax.servlet.error.request_uri"
public static final java.lang.String 	ERROR_SERVLET_NAME 		"javax.servlet.error.servlet_name"
public static final java.lang.String 	ERROR_STATUS_CODE 		"javax.servlet.error.status_code"	 
 
	 * 
	 * 
	 * exemple :
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// les infos à afficher:
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter ecrivain = response.getWriter();
		ecrivain.append("<html>");
		ecrivain.append("<head>");
		ecrivain.append("<title>");
		ecrivain.append(" Pile d'erreur techniques");
		
		ecrivain.append("</title>");
		
		ecrivain.append("</head>");
		
		ecrivain.append("<body>");
		ecrivain.append("<h2>Voilà La pile d'exceptions</h2>");
		genererAffichageMetaDonneesException(request, ecrivain);
		ecrivain.append("<p>");
		ecrivain.append("texte");
		ecrivain.append("</p>");
		
		ecrivain.append("</body>");
		ecrivain.append("</html>");
		
		ecrivain.flush();
		
		ecrivain.close();
		
	}

	/**
	 * Génère un affichage sur le flux de sortie choisit.
	 * Par exemple le printwartier d'un objet {@see HttpServletResponse}
	 * 
	 * @param request
	 * @param fluxEcrivain
	 * @return
	 */
	protected String genererAffichageMetaDonneesException(HttpServletRequest request, PrintWriter fluxEcrivain) {
		String affichage = "message par défaut";
		
		
//		public static final java.lang.String 	ERROR_EXCEPTION 		"javax.servlet.error.exception"
//		public static final java.lang.String 	ERROR_EXCEPTION_TYPE 	"javax.servlet.error.exception_type"
//		public static final java.lang.String 	ERROR_MESSAGE 			"javax.servlet.error.message"
//		public static final java.lang.String 	ERROR_REQUEST_URI 		"javax.servlet.error.request_uri"
//		public static final java.lang.String 	ERROR_SERVLET_NAME 		"javax.servlet.error.servlet_name"
//		public static final java.lang.String 	ERROR_STATUS_CODE 		"javax.servlet.error.status_code"	
		
		// infos;
		
		StringBuilder sb = new StringBuilder();
		
		java.lang.Throwable lexecptionElleMeme = null;
		java.lang.Throwable leNomdeClasseDeLexception = null;
		java.lang.String msgDeLexception = null;
		java.lang.String URIrequeteException = null;
		java.lang.String servletResponsable = null;
		java.lang.String codeHTTP = null;
		
		try {
			lexecptionElleMeme = (java.lang.Throwable) request.getAttribute("javax.servlet.error.exception");
			leNomdeClasseDeLexception = (java.lang.Throwable) request.getAttribute("javax.servlet.error.exception_type");
			msgDeLexception = (String) request.getAttribute("javax.servlet.error.message");
			URIrequeteException = (String) request.getAttribute("javax.servlet.error.request_uri");
			servletResponsable = (String) request.getAttribute("javax.servlet.error.servlet_name");
			codeHTTP = (String) request.getAttribute("javax.servlet.error.status_code");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			sb.append(" Un problème est survenu lors de la récupérations des infos");
		}
		
		
		
		try {
			// les infos à afficher:
			// méta données
			sb.append(" <li> " + " [JIBL] méta-données de l'exception : [JIBL]" +  "</li>");
			sb.append(" <li> " + " [JIBL] classe de l'exception : " + leNomdeClasseDeLexception +  "</li>");
			sb.append(" <li> " + " [JIBL] message de l'exception : " + msgDeLexception +  "</li>");
			sb.append(" <li> " + " [JIBL] URIrequeteException : " + URIrequeteException +  "</li>");
			sb.append(" <li> " + " [JIBL] servletResponsable : " + servletResponsable +  "</li>");
			sb.append(" <li> " + " [JIBL] codeHTTP : " + codeHTTP +  "</li>");
		} catch (NullPointerException e) {
			
//			e.printStackTrace();
			sb.append(" Un problème NULL POINTER EXCEPTION est survenu lors de la récupération des infos");
		}
		
		
		fluxEcrivain.append(sb.toString());
		
		// print stackTrace
		fluxEcrivain.append(" ------------------------------------------------ STACKTRACE DE L'EXECPTION :");
		lexecptionElleMeme.printStackTrace(fluxEcrivain);
		fluxEcrivain.append(" ------------------------------------------------ MESSAGE DE L'EXECPTION :");
		fluxEcrivain.append(lexecptionElleMeme.getMessage());
		fluxEcrivain.append(" ------------------------------------------------ ---------------------- ");
		
		affichage = sb.toString();
		
		return affichage;

	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
