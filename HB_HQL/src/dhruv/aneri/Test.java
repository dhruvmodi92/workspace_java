package dhruv.aneri;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import dhruv.aneri.dto.UserDetails;

public class Test {

	public static void main(String args[])
	{



		SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sesssionFactory.openSession();
		session.beginTransaction();
		/*for(int i=1;i<11;i++)
		{
			UserDetails user = new UserDetails();
			user.setUserName("User"+i);
			session.save(user);
		}*/

		/*Pagination
		 Query query = session.createQuery("Select userName from UserDetails");
		query.setFirstResult(6);//fetch row from 6th index
		query.setMaxResults(2);//fetch n number of row
		List<String> users = (List<String>)query.list();


		System.out.println("List Size : "+users.size());
		for (String u : users)
		{
			System.out.println("Name of user : "+u);
		}*/

		/*Query query = session.createQuery("Select max(userId) from UserDetails");

		List<Integer> id = (List<Integer>)query.list();
		System.out.println("id : "+id.toString()+ " size : "+id.size());*/

		/*Query query = session.createQuery("Select userName,userId from UserDetails");
		List<Object[]> users = (List<Object[]>)query.list();
		System.out.println("List Size : "+users.size());
		for ( Object[] u : users)
		{
			Integer id = (Integer)u[1];
			String name = (String)u[0];
			System.out.println("Name of user : "+name+ " id : "+id);
		}
		 */

		/*safe query
		 * Query query = session.createQuery("from UserDetails where userId > ? and userName = :username");
		Integer minUserId = 5;
		String name = "user8";
		query.setInteger(0, minUserId);//sequentially passed value to query like in jdbc(preparestatement)
		query.setString("username", name);//using perticular string passing value to query
		List<UserDetails> users = (List<UserDetails>)query.list();


		System.out.println("List Size : "+users.size());
		for (UserDetails u : users)
		{
			System.out.println("Name of user : "+u.getUserName());
		}*/

		/*NamedQuery 
		 Query query = session.getNamedQuery("UserDetails.byId");
		 query.setInteger(0,5);
		List<UserDetails> users = (List<UserDetails>)query.list();


		System.out.println("List Size : "+users.size());
		for (UserDetails u : users)
		{
			System.out.println("Name of user : "+u.getUserName());
		}*/

		/*NamedNativequery
		Query query = session.getNamedQuery("UserDetails.byName");
		query.setString(0, "User7");
		List<UserDetails> users = (List<UserDetails>)query.list();


		System.out.println("List Size : "+users.size());
		for (UserDetails u : users)
		{
			System.out.println("Name of user : "+u.getUserName()+" Id : "+u.getUserId());
		}
		*/
		
		/* Using Criteria...this is the third way to catch data...
		 * Criteria criteria = session.createCriteria(UserDetails.class);
		//criteria.add(Restrictions.gt("userId", 5));
		//criteria.add(Restrictions.eq("userName","User7"));
		//criteria.add(Restrictions.or(Restrictions.lt("userId", 3),Restrictions.between("userId", 6, 10)));//or condition in query
		criteria.add(Restrictions.eq("userName","User7"))
				.add(Restrictions.between("userId", 6, 10));// and condition in query
				List<UserDetails> users = (List<UserDetails>)criteria.list();


		System.out.println("List Size : "+users.size());
		for (UserDetails u : users)
		{
			System.out.println("Name of user : "+u.getUserName()+" Id : "+u.getUserId());
		}

				*/
		
		/* Projection : If you want to retrieve only userName, then Use setProjection and set Projection.property("userName")
		Criteria criteria = session.createCriteria(UserDetails.class)
				.setProjection(Projections.property("userName"));
		criteria.add(Restrictions.between("userId", 3, 7));
		List<String> users = (List<String>)criteria.list();


		System.out.println("List Size : "+users.size());
		for (String u : users)
		{
			System.out.println(" Name : "+u);
		}

		*/
		
		/*Criteria criteria = session.createCriteria(UserDetails.class)
				.setProjection(Projections.max("userId"));
		
		List<Integer> users = (List<Integer>)criteria.list();


		System.out.println("List Size : "+users.size()+ " Max : "+users);*/
		
		
		session.getTransaction().commit();
		session.close();

	}
}
