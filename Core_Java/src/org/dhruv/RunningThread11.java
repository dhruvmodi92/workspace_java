package org.dhruv;

class DhruvRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread name : "+Thread.currentThread().getName()+" "+i);
		}
	}



}

class RunningThread11
{
	public static void main(String args[])
	{
		Runnable r = new DhruvRunnable();
		Thread t1 = new Thread(r);
		t1.setName("Dhruv");
		Thread t2 = new Thread(r);
		t2.setName("Aneri");
		System.out.println("Running Thread : "+Thread.currentThread().getName());
		
		
	}
}