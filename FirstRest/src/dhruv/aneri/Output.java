package dhruv.aneri;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:8080/FirstRest/rest/firstrest/1
@Path ("/firstrest")
public class Output {
	
	@GET
	@Path ("/{id}")
	//@Produces(MediaType.TEXT_XML)
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Employee getUser(@PathParam("id")int id)
	{
		Employee emp = new Employee();
		if(id == 1)
		{
			emp.setId(1);
			emp.setName("Dhruv");
			emp.setDept("Java");
			emp.setSalary(31000);
		}
		if(id == 2)
		{
			emp.setId(2);
			emp.setName("Aneri");
			emp.setDept("Research");
			emp.setSalary(12000);
		}
		return emp;
	}

}
