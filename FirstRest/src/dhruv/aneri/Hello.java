package dhruv.aneri;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*http://localhost:8080/FirstRest/rest/hello*/

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHtmlHello()
	{
		String str = "Dhruv loves Aneri";
		System.out.print(str);
		return "<html>" + "<title>" + "Hello" +"</title>" + "<body>" +"<h1>"+ str +"</h1>"+"</body>"+"</html>";
	}
	/*@Produces(MediaType.TEXT_PLAIN)
	public String getPlainHello()
	{
		String str = "Dhruv loves Aneri";
		return str;
	}*/
}
