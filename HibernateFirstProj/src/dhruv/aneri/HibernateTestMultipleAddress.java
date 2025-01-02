package dhruv.aneri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dhruv.aneri.dto.Address;
import dhruv.aneri.dto.UserDetailsMultipleAddress;

public class HibernateTestMultipleAddress {
	public static void main(String args[])
	{
		UserDetailsMultipleAddress user1 = new UserDetailsMultipleAddress();
		user1.setUserName("Dhruv");

		UserDetailsMultipleAddress user2 = new UserDetailsMultipleAddress();
		user2.setUserName("Aneri");

		Address address1 = new Address();
		address1.setStreet("Wadgaon Sheri");
		address1.setCity("Pune");
		address1.setState("Maharastra");

		Address address2 = new Address();
		address2.setStreet("Naranpura");
		address2.setCity("Ahmedabad");
		address2.setState("Gujarat");

		Address address3 = new Address();
		address3.setStreet("Usmanpura");
		address3.setCity("Ahmedabad");
		address3.setState("Gujarat");

		user1.getListOfAddress().add(address1);
		user1.getListOfAddress().add(address2);
		user2.getListOfAddress().add(address3);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();

		user1 =null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user1 = (UserDetailsMultipleAddress)session.get(UserDetailsMultipleAddress.class, 1);
		session.close();
		System.out.println("Name : "+ user1.getUserName());
		System.out.println("Id : "+user1.getUserId());

		Collection<Address> listOfAddress = new ArrayList<Address>();
		listOfAddress = user1.getListOfAddress();
		for(Address adr : listOfAddress)
		{
			System.out.println("street : "+adr.getStreet() );
			System.out.println("city : "+adr.getCity());
			System.out.println("state : "+adr.getState());
		}
				

	}
}
