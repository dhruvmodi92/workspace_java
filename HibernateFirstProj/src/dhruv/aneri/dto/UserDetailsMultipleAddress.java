package dhruv.aneri.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity @Table(name="MultipleAddressUser")
public class UserDetailsMultipleAddress {
	private static final String fetch = null;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	@ElementCollection (fetch=FetchType.EAGER)
	@JoinTable(name = "addressofuser",
	joinColumns=@JoinColumn(name="user_id"))
	//@GenericGenerator(name = "sequence-gen", strategy = "sequence")
	//@CollectionId(columns = { @Column(name="address_id") }, generator = "sequence-gen", type = @Type(type = "long"))
	private Collection<Address> listOfAddress = new ArrayList<Address>();
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Column (name = "user_name")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}
	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	
	
	
	
	
	
}
