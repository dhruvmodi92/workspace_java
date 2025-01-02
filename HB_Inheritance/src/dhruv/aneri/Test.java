package dhruv.aneri;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dhruv.aneri.dto.FourWheeler;
import dhruv.aneri.dto.TwoWheeler;
import dhruv.aneri.dto.Vehicle;

public class Test {

	public static void main(String args[])
	{
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicle_name("Activa");
		
		FourWheeler fWheeler = new FourWheeler();
		fWheeler.setVehicle_name("Audi");
		fWheeler.setSteeringWheel("Audi Steering");
		
		TwoWheeler tWheeler = new TwoWheeler();
		tWheeler.setVehicle_name("Royal Enfield");
		tWheeler.setSteeringHandle("Royal Handle");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(tWheeler);
		session.save(fWheeler);
		session.getTransaction().commit();
		session.close();
		
		/*session = sessionFactory.openSession();
		session.beginTransaction();
		FourWheeler retFourWheeler = (FourWheeler)session.get(FourWheeler.class, 3);
		System.out.print("Vehicle id : "+retFourWheeler.getVehicle_id()+" Vehicle name : "+retFourWheeler.getVehicle_name()+" Steering Wheel : "+retFourWheeler.getSteeringWheel());
		session.close();*/
		
	}
}
