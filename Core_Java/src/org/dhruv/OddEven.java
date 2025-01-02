package org.dhruv;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedPrinter sp = new SharedPrinter(10);
		sp.isOdd = true;
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run()
			{
				try {
					sp.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run()
			{
				try {
					sp.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}


class SharedPrinter{
	boolean isOdd;
	int limit;
	SharedPrinter(int limit)
	{
		this.limit = limit;
	}
	
	public synchronized void printOdd() throws InterruptedException
	{
		int j = 1;
		while(j < limit)
		{
			while(!isOdd)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(j);
			j += 2;
			isOdd = false;
			Thread.sleep(1000);
			notify();
		}
	}
	
	public synchronized void printEven() throws InterruptedException
	{
		int j = 2;
		while(j < limit)
		{
			while(isOdd)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(j);
			j += 2;
			isOdd = true;
			Thread.sleep(1000);
			notify();
		}
	}
	
}