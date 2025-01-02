package org.dhruv;

import java.util.concurrent.Semaphore;

public class OddEvenSemaPhore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		int limit = 11;
		Thread tOdd = new Thread(new Runnable() {
			public void run()
			{
				for(int i = 1; i < limit ; i=i+2)
				{
					try {
						p.printOdd(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread tEven = new Thread(new Runnable() {
			public void run()
			{
				for(int i = 2; i < limit ; i=i+2)
				{
					try {
						p.printEven(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		tOdd.start();
		tEven.start();
		
	}

}


class Printer
{
	Semaphore semEven = new Semaphore(0);
	Semaphore semOdd = new Semaphore(1);
	
	public void printOdd(int i) throws InterruptedException
	{
		semOdd.acquire();
		System.out.println(i);
		Thread.sleep(1000);
		semEven.release();
	}
	
	public void printEven(int i) throws InterruptedException
	{
		semEven.acquire();
		System.out.println(i);
		Thread.sleep(1000);
		semOdd.release();
	}
	
}