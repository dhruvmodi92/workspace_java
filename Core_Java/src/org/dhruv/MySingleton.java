package org.dhruv;

class MySingleton {

	private static MySingleton myObj;
	
	private MySingleton()
	{}
	
	public static MySingleton getInstance()
	{
		if(myObj == null)
		{
			myObj = new MySingleton();
		}
		return myObj;
	}
}
