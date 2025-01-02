package dhruv.aneri;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import dhruv.aneri.dto.UserDetailsQueryByExample;

public class TestQueryByExample {

	public static void main(String args[])
	{
		SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sesssionFactory.openSession();
		session.beginTransaction();
		/*for(int i=1;i<11;i++)
		{
			UserDetailsQueryByExample user = new UserDetailsQueryByExample();
			user.setUserName("User"+i);
			user.setAge(i);
			user.setSurname("surname"+i);
			session.save(user);
		}*/
		
		UserDetailsQueryByExample user = new UserDetailsQueryByExample();
		user.setAge(1);
		//user.setAge(2);
		//user.setUserId(1);
		user.setSurname("surname2");
		
		Example exp = Example.create(user).excludeProperty("surname");
		
		Criteria crt = session.createCriteria(UserDetailsQueryByExample.class).add(exp);
		//crt.add(Restrictions.gt("userId", 4));
		List<UserDetailsQueryByExample> users = (List<UserDetailsQueryByExample>)crt.list();


		System.out.println("List Size : "+users.size());
		for (UserDetailsQueryByExample u : users)
		{
			System.out.println(" Name : "+u.getUserName()+ " id : "+u.getUserId()+" surname : "+u.getSurname());
		}


		session.getTransaction().commit();
		session.close();
	}

}
