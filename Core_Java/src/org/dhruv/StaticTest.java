package org.dhruv;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class chambu{
	static{System.out.print("1");}
}
public class StaticTest extends chambu{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2");
		HashMap<chambu,String> map = new HashMap<chambu,String>();
		Map<chambu,String> map1 = new TreeMap<chambu,String>();
		map1.put(new chambu(),new String("S1"));
		map1.put(new chambu(),new String("S1"));
	}

}
