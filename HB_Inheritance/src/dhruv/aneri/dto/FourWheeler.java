package dhruv.aneri.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/* To set value of dicriminator value for FourWheeler
 @DiscriminatorValue(value = "FW")*/
public class FourWheeler extends Vehicle {

	private String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}
	
	
}
