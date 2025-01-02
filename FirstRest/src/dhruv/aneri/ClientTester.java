package dhruv.aneri;


import javax.ws.rs.core.MediaType;
import javax.ws.*;




public class ClientTester {

	private static Client client;
	private static String URL = "http://localhost:8080/FirstRest/rest/firstrest";
	
	private void init()
	{
		this.client = ClientBuilder.newClient();
	}
	public static void main (String args[])
	{
		ClientTester ct = new ClientTester();
		ct.init();
		Employee emp = client.target(URL).path("/{userid}").resolveTemplate("userid",1).request(MediaType.TEXT_XML).get(Employee.class);
		System.out.println(emp.getId());
	}
}
