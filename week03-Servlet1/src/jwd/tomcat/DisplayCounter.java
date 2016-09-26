package jwd.tomcat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class DisplayCounter
 */
@WebServlet("/DisplayCounter")
public class DisplayCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	 super.init(config);
	 Integer counter=0;
	 ServletContext context=getServletContext();
	 context.setAttribute("Counter", counter);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext servletContext= getServletContext();
		Integer counter=(Integer)servletContext.getAttribute("Counter");
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Display Counter</title></head><body>");
		out.println("<p> The counter value is currently: " + counter + "</p>" );
		out.println("</body></html>");
	}

}
