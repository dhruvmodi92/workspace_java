package org.dhruv;

public class FinalConcept {
	
	private final int var;
	private static final int var1;
	static
	{
		var1 = 6;
	}
	FinalConcept(int var)
	{
		this.var = var;
		
	}
	public static void main(String args[])
	{
		FinalConcept f = new FinalConcept(5);
		System.out.println(f.var+" "+var1);
	}
}
