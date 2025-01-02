package org.dhruv;

import java.util.Map;

public class ConcurrentHashMap {
	public static void main(String args[])
	{
		Map<String,Integer> carPrice = new java.util.concurrent.ConcurrentHashMap<String,Integer>();
		carPrice.put("Audi", 10000);
		carPrice.put("i-ten", 5000);
		carPrice.put("centro", 3000);
		
		for(Map.Entry<String, Integer> car : carPrice.entrySet())
		{
			System.out.println("Car : "+car.getKey());
			carPrice.put("i-20", 4000);
			System.out.println("Price : "+car.getValue());

			
		}
		System.out.println(carPrice.size());
	}
}