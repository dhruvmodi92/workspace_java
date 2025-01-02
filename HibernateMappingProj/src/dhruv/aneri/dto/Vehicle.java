package dhruv.aneri.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_manytomany")
public class Vehicle {

	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	/*@ManyToOne
	@JoinColumn(name = "user_id")
	private UserDetails user;
		
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}*/
	
	@ManyToMany
	private Collection<UserDetails> listOfUsers = new ArrayList<UserDetails>();
	
	
	public Collection<UserDetails> getListOfUsers() {
		return listOfUsers;
	}
	public void setListOfUsers(Collection<UserDetails> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
	
}
