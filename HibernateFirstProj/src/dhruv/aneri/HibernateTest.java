package dhruv.aneri;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dhruv.aneri.dto.Address;
import dhruv.aneri.dto.UserDetails;

public class HibernateTest {

	
	public static void main(String args[])
	{
		UserDetails user = new UserDetails();
		//user.setUserId(5);
		//user.setUserName("Kausha");
		//user.setUserId(1);
		user.setUserName("Dhruv");
		Address ofc_adr = new Address();
		Address home_adr = new Address();
		home_adr.setStreet("Vijayanagar");
		home_adr.setCity("Ahmedabad");
		home_adr.setState("Gujrat");
		ofc_adr.setStreet("Garima Park");
		ofc_adr.setCity("Gandhinagar");
		ofc_adr.setState("Gujrat");
		user.setOffice_address(ofc_adr);
		user.setHome_address(home_adr);
		/*user.setJoinedDate(new Date());
		user.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");*/
		UserDetails user1 = new UserDetails();
		//user1.setUserId(2);
		user1.setUserName("Aneri");
		//user1.setJoinedDate(new Date());
		user1.setHome_address(home_adr);
		user1.setOffice_address(ofc_adr);
		//Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user1);
		session.getTransaction().commit();
		session.close();
		
		/* Retreive data from database
		 user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails)session.get(UserDetails.class,1);
		session.close();
		System.out.println("UserName : "+user.getUserName());*/
		
		
		
	}
}
