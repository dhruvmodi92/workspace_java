

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class servletFilt
 */
@WebFilter("/servletFilt")
public class servletFilt implements Filter {

    /**
     * Default constructor. 
     */
    public servletFilt() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String pwd = (String)request.getParameter("password");
		if(null != pwd && pwd.equalsIgnoreCase("dhruv"))
		{
			
			chain.doFilter(request, response);
		}
		else
		{
			HttpServletResponse resp = (HttpServletResponse)response;
			//resp.sendError(407, "Password is incorrect !! ");
			//request.setAttribute("name", request.getParameter("userName"));
			((HttpServletRequest)request).getSession().setAttribute("authentication","failed");
			RequestDispatcher req = request.getRequestDispatcher("success.jsp");
			req.forward(request, response);
		}
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
