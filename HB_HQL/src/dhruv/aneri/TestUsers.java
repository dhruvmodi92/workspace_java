package dhruv.aneri;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import dhruv.aneri.dto.Users;

public class TestUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sesssionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sesssionFactory.openSession();
		session.beginTransaction();
		/*for(int i=1;i<11;i++)
		{
			Users user = new Users();
			user.setUserId(i);
			user.setUserName("User"+i);
			if(i == 2)
			{
			user.setBirthDate(new Date());
			}
			session.save(user);
		}*/
		
		List<Users> usersList = session.createCriteria(Users.class).add(Restrictions.eq("userId",4)).list();
		Users user = usersList.get(0);
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		if(null != user.getBirthDate())
		{
		String Date = dateFormat.format(user.getBirthDate());
		}
		session.getTransaction().commit();
		session.close();

		
		
	}

}
