package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UserDetails;
import model.AddUserDetails;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//response.getWriter().println("user received is "+request.getParameter("userName"));
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String fullName = request.getParameter("fullName");
		String gender = request.getParameter("gender");
		String location = request.getParameter("location");
		AddUserDetails userDetails = new AddUserDetails();
		UserDetails user = userDetails.addDetails(userName, password, fullName, gender, location);
		//response.getWriter().println("user received is "+user.getFullName());
		if(user != null)
		{
			request.setAttribute("user", user);
			RequestDispatcher dispatch = request.getRequestDispatcher("success.jsp");
			dispatch.forward(request, response);
			
		}
		else
		{
			response.getWriter().println("user received is null");
		}
		

	}

}
