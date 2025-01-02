package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dto.UserDetails;

public class AddUserDetails {

	public UserDetails addDetails(String userName,String password,String fullName,String gender,String location)
	{
		UserDetails user = new UserDetails();
		user.setUserName(userName);
		user.setPassword(password);
		user.setFullName(fullName);
		user.setGender(gender);
		user.setLocation(location);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		
		
		return user;
	}
}
