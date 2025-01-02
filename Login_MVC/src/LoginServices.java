import java.util.HashMap;
import dto.UserDetails;

public class LoginServices {
	HashMap<String, UserDetails> userDetails = new HashMap<String,UserDetails>();
	
	public LoginServices()
	{
		
		UserDetails user1 = new UserDetails();
		UserDetails user2 = new UserDetails();
		user1.setUserName("dmodi");
		user1.setFullName("Dhruv Modi");
		user1.setGender("Male");
		user1.setCity("Pune");
		user2.setUserName("amodi");
		user2.setFullName("Aneri Modi");
		user2.setGender("Female");
		user2.setCity("Ahmedabad");
		userDetails.put("dmodi",user1);
		userDetails.put("amodi",user2);
	}

	public boolean authenticateUserName(String userName)
	{
		if((userName == null) || (userName.trim()==""))
		{
			return false;
		}
		return true;
	}
	public boolean authenticatePassword(String password)
	{
		if((password == null) || (password.trim()==""))
		{
			return false;
		}
		return true;
	}
	public UserDetails getUserDetails(String userName)
	{
		UserDetails user = new UserDetails();
		user = userDetails.get(userName);
		System.out.println(user.getFullName());
		return user;
	}
}
