package jwd.tomcat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
 import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet1(HttpServletRequest request, HttpServletResponse response)
	 */
 /* public void doGet1( HttpServletRequest request,HttpServletResponse response )      
    		throws ServletException, IOException    {       
    	PrintWriter out = response.getWriter();       
    	out.println("Hello World");    
    	}
	*/
    /*public void doGet( HttpServletRequest request,HttpServletResponse response )      
    		throws ServletException, IOException    {  
    	PrintWriter out = response.getWriter();     
    	response.setContentType("text/html");
    	out.println("<html><head><title><Hello></title></head><body>");
    	out.println("<body><h2>Hello World!</h2></body></html>");
    }*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
*/
    public void doGet( HttpServletRequest request,HttpServletResponse response )      
    		throws ServletException, IOException    { 
    PrintWriter out= response.getWriter();
    out.println("Hello World");
    }
}
