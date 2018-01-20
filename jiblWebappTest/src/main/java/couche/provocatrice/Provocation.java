package couche.provocatrice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class Provocation
 */
public class Provocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
//	@Resource(name = "jdbc/organisactionDS2")
	@Resource(name = "java:comp/env/jdbc/organisactionDS2")
	private DataSource ds;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Provocation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.log("========================================== [JIBL-LOGGER DE LA SERVLET /Provocation]", e);
		}
		
		response.getWriter().append("Oui, à priori, aucune erreur due au datasource {java:comp/env/jdbc/organisactionDS2} pour l'instant. ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
