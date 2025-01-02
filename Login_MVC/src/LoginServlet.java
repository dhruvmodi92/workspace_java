
import dto.UserDetails;
import java.io.IOException;
import java.lang.String;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().println("HI..");
		String userName,password;
		userName = request.getParameter("userName");
		password = request.getParameter("password");
		
		LoginServices service = new LoginServices();
		boolean retValUserName,retValPassword;
		retValUserName = service.authenticateUserName(userName);
		retValPassword = service.authenticatePassword(password);
		if(retValUserName && retValPassword)
		{
			
			UserDetails user = service.getUserDetails(userName);
			/*request.getSession().setAttribute("user", user);
			response.sendRedirect("Welcome.jsp");*/
			request.setAttribute("user", user);
			RequestDispatcher dispatch = request.getRequestDispatcher("success.jsp");
			//RequestDispatcher dispatch = request.getRequestDispatcher("success1.jsp");
			dispatch.forward(request, response);
			return;
		}
		else
		{
			response.sendRedirect("loginPage.jsp");
			return;
		}
		
	}

}
