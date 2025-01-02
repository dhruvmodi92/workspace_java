package dhruv.aneri.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/* To set value of dicriminator value for TwoWheeler
@DiscriminatorValue(value = "TW")*/
public class TwoWheeler extends Vehicle {

	private String SteeringHandle;

	public String getSteeringHandle() {
		return SteeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}
	
	
}
