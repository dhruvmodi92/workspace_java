package org.dhruv;

import java.util.HashMap;
import java.util.Map;

public class FailFastHashIterator {

	public static void main(String args[])
	{
		Map<String,Integer> carPrice = new HashMap<String,Integer>();
		carPrice.put("Audi", 10000);
		carPrice.put("i-ten", 5000);
		carPrice.put("centro", 3000);
		int i = 0;

		for(Map.Entry<String, Integer> car : carPrice.entrySet())
		{
			System.out.println("Car : "+car.getKey());
			System.out.println("Price : "+car.getValue());
			i++;
			if(i == 2)
			{
				carPrice.put("i-20",4000);
			}
		}
		System.out.println(carPrice.size());
	}

}
