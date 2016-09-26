package jwd.tomcat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Context;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class RequestCounter
 */
@WebServlet("/RequestCounter")
public class RequestCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int counter;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	/*public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		Integer counter=0;
		ServletContext context= getServletContext();
		context.setAttribute("Counter", counter);
	}*/
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	counter=0;
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		Integer counter= (Integer)context.getAttribute("Counter");
		counter++;
		context.setAttribute("Counter", counter);
		PrintWriter out= response.getWriter();
		out.println("<html><head><title>RequestCounter</title></head><body>");
		out.println("The counter has been increased");
		out.println("</body></html>");
		
	}*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		++counter;
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>RequestCounter</title></head><body>");
		out.println("You are visitor#"+counter+".");
		out.println("</body></html>");
				}


}
