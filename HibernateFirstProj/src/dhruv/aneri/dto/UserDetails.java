package dhruv.aneri.dto;



import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table (name = "Generated_USER_DETAILS")
public class UserDetails {
	//@Id
	//@Column (name = "user_id")
	@Id @GeneratedValue
	private int userId;
	private String userName;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="ofc_street")),
		@AttributeOverride(name="city",column=@Column(name="ofc_city")),
		@AttributeOverride(name="state",column=@Column(name="ofc_state")),
		})
	private Address office_address;
	@Embedded
	private Address home_address;
	/*private Date joinedDate;
	private String description;
	
	@Temporal (TemporalType.DATE)
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	@Lob
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}*/
	//@Id  @Column (name = "user_id")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	//@Column (name = "user_name")
	public String getUserName() {
		return userName + "from getter";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Address getOffice_address() {
		return office_address;
	}
	public void setOffice_address(Address office_address) {
		this.office_address = office_address;
	}
	public Address getHome_address() {
		return home_address;
	}
	public void setHome_address(Address home_address) {
		this.home_address = home_address;
	}
	
	
	
}
