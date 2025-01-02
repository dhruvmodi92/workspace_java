package org.dhruv;


public class Join {

	public static void main(String args[]) throws InterruptedException
	{
		PrintTable t = new PrintTable();
		MyRunnable1 r1 = new MyRunnable1(t);
		MyRunnable2 r2 = new MyRunnable2(t);		
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		
		thread1.start();
		thread2.start();
		
		//join method : causes currently running thread to stop execution until the thread it joins(thread1) complete its task...
		//System.out.println("Before Join");
		thread1.join();
		System.out.println("Hi");
		
	}
}

class PrintTable
{

	void printTable(int n) throws InterruptedException
	{
		for (int i = 1; i<50; i++)
		{
			System.out.println(n*i);
			//Thread.sleep(100);
		}
		
	}
}

class MyRunnable1 implements Runnable
{
	PrintTable t1;
	MyRunnable1(PrintTable t) {
		this.t1 = t;
	}
	
	
	public void run ()
	{
		try {
			PrintTable t1 = new PrintTable();
			t1.printTable(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyRunnable2 implements Runnable
{
	PrintTable t1;
	MyRunnable2(PrintTable t) {
		this.t1 = t;
	}
	
	
	public void run ()
	{
		try {
			PrintTable t1 = new PrintTable();
			t1.printTable(17);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

