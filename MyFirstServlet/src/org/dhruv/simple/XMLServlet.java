package org.dhruv.simple;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

public class XMLServlet extends HttpServlet {

	/**
	 * 
	 */
	//	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private static final long serialVersionUID = 16280764231384350L;

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello...XML Servlet");
		//PrintWriter writer = response.getWriter();
		//writer.
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != null && userName != "")
		{
			context.setAttribute("contextUserName", userName);
			session.setAttribute("sessionUserName", userName);
		}
		response.getWriter().println("From Get method request parameter...Hello "+userName+" !!!<br>");
		response.getWriter().println("From Get method session parameter...Hello "+(String)session.getAttribute("sessionUserName")+" !!!<br>");
		response.getWriter().println("From Get method context parameter...Hello "+(String)context.getAttribute("contextUserName")+" !!!");
		//response.getWriter().append(" MODI JINDABAD \n"+"Hello User !!!!\n").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello...XML Servlet from post");
		//PrintWriter writer = response.getWriter();
		//writer.
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String gender = request.getParameter("gender");
		String[] location = request.getParameterValues("location");
		response.getWriter().println("From Post method...Welcome "+userName+" !!!<br>");
		response.getWriter().println("Your Full Name is "+fullName+"<br>");
		response.getWriter().println("Gender : "+gender+"<br>");
		for(int i=0;i<location.length;i++)
		{
			response.getWriter().println("Prefered Location"+(i+1)+" : "+location[i]+"<br>");
		}
	}


}
