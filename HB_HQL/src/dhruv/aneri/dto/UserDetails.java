package dhruv.aneri.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity @Table(name = "user_details")
@NamedQuery(name = "UserDetails.byId",query = "from UserDetails where userId > ?")
@NamedNativeQuery(name="UserDetails.byName",query="Select * from user_details where Name = ?",resultClass=UserDetails.class)
public class UserDetails {

	@Id @GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="ID")
	private int userId;
	@Column(name = "Name")
	private String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
