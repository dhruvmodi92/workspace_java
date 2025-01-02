package dhruv.aneri.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_manytomany")
public class UserDetails {
	
	@Id @GeneratedValue
	private int userId;
	private String userName;
	
	/* one to one mapping
	@OneToOne
	@JoinColumn(name= "vehicle_Id")
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	*/
	
	
	/*@OneToMany (mappedBy = "user")*/
	/*@JoinTable(name = "user_vehicle",
	joinColumns=@JoinColumn(name = "user_id"),
	inverseJoinColumns=@JoinColumn(name = "vehicle_id"))*/
	
	
	@ManyToMany
	private Collection<Vehicle> listOfVehicle = new ArrayList<Vehicle>();
	
	public Collection<Vehicle> getListOfVehicle() {
		return listOfVehicle;
	}
	public void setListOfVehicle(Collection<Vehicle> listOfVehicle) {
		this.listOfVehicle = listOfVehicle;
	}
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
