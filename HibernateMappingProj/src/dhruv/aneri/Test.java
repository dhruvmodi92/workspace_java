package dhruv.aneri;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dhruv.aneri.dto.UserDetails;
import dhruv.aneri.dto.Vehicle;

public class Test {

	public static void main(String args[])
	{
		
		/*UserDetails user = new UserDetails();
		//user.setUserId(1);
		user.setUserName("Aneri");
		
		UserDetails user1 = new UserDetails();
		user1.setUserName("Dhruv");
		
		Vehicle vehicle = new Vehicle();
		//vehicle.setVehicleId(1);
		vehicle.setVehicleName("Activa");
		vehicle.getListOfUsers().add(user);

		Vehicle vehicle1 = new Vehicle();
		//vehicle1.setVehicleId(2);
		vehicle1.setVehicleName("Audi");
		vehicle1.getListOfUsers().add(user);
		vehicle1.getListOfUsers().add(user1);		

		user.getListOfVehicle().add(vehicle);
		user.getListOfVehicle().add(vehicle1);
		user1.getListOfVehicle().add(vehicle1);
		//user.setVehicle(vehicle);*/
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		/*session.save(user);
		session.save(user1);
		session.save(vehicle);
		session.save(vehicle1);
		session.getTransaction().commit();
		session.close();*/
		
		Vehicle retVehicle = (Vehicle)session.get(Vehicle.class, 3);
		System.out.println("Vehicle Id : "+retVehicle.getVehicleId()+" Vehicle Name : "+retVehicle.getVehicleName());
		Collection<UserDetails> users = (Collection<UserDetails>)retVehicle.getListOfUsers();
		for(UserDetails user : users)
		{
		System.out.println("User Id : "+user.getUserId()+ " User name : "+user.getUserName());
		}
		
		System.out.println("********************************************************************************");
		retVehicle = null;
		users = null;
		retVehicle = (Vehicle)session.get(Vehicle.class, 4);
		System.out.println("Vehicle Id : "+retVehicle.getVehicleId()+" Vehicle Name : "+retVehicle.getVehicleName());
		users = (Collection<UserDetails>)retVehicle.getListOfUsers();
		for(UserDetails user : users)
		{
		System.out.println("User Id : "+user.getUserId()+ " User name : "+user.getUserName());
		}
		
		
	}
}
