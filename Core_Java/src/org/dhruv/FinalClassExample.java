package org.dhruv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class FinalClassExample {

	private final int id;

	private final String name;

	private final HashMap<String, String> testMap;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/**
	 * Accessor function for mutable objects
	 */
	public HashMap<String,String> getTestMap() {
		// return testMap;
		return new HashMap<String,String>(Collections.unmodifiableMap(testMap));//(HashMap<String, String>) testMap.clone();
		
	}

	/**
	 * Constructor performing Deep Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */

	public FinalClassExample(int i, String n, HashMap<String, String> hm) {
		System.out.println("Performing Deep Copy for Object initialization");
		this.id = i;
		this.name = n;
		this.testMap = hm;
	}

	/**
	 * Constructor performing Shallow Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */
	/**
	 * public FinalClassExample(int i, String n, HashMap<String,String> hm){
	 * System.out.println("Performing Shallow Copy for Object initialization");
	 * this.id=i; this.name=n; this.testMap=hm; }
	 */

	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep
	 * Copy for creating immutable classes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "first");
		h1.put("2", "second");

		String s = "original";

		int i = 10;

		FinalClassExample ce = new FinalClassExample(i, s, h1);
		
		HashMap<String, String> m = ce.getTestMap();
		
		System.out.println(m);
		
		m.put("3", "Third");
		m.put("4","Fourth");
		
		System.out.println(m);
		
		System.out.println(ce.getTestMap());

	}

}
