package org.dhruv;

public class SynchronizedConcept {
	public static void main(String args[])
	{
		//debit example only
		/*Account a = new Account(50);
		Thread t1 = new Thread(a,"Dhruv");
		Thread t2 = new Thread(a,"Aneri");
		t1.start();
		t2.start();*/
		
		//For debit-credit example -- run method commented
		Account a = new Account(0);
		Thread t1 = new Thread(a,"Dhruv");
		Thread t2 = new Thread(a,"Aneri");
		t1.start();
		t2.start();
		
	}
	
	
}

class Account implements Runnable
{
	private int balance;
	Account(int amount)
	{
		this.balance = amount;
	}
	
	int getBalance()
	{
		/*synchronized(this)
		{
			System.out.println("Balance : "+this.balance+" : "+Thread.currentThread().getName());
		}*/
		return this.balance;
	}
	
	void debit(int amount)
	{
		synchronized(this)
		{
			
			if(this.getBalance() > 0)
			{
				System.out.println(Thread.currentThread().getName()+ " is going to debit : "+" balance : "+this.getBalance());
				this.balance = this.balance - amount;
				try {
					//Thread.sleep(1000);
					System.out.println("Debited by : "+Thread.currentThread().getName()+ " balance : "+this.getBalance());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				if(this.balance == 0)
					System.out.println("No More Amount to withdraw");
				else
					System.out.println("Account is overdrawn");
			}
		}
		
	}
	
	void credit(int amount)
	{
		synchronized(this)
		{
			
			if(!(this.getBalance() < 0))
			{
				System.out.println(Thread.currentThread().getName()+ " is going to credit : "+" balance : "+this.getBalance());
				this.balance = this.balance + amount;
				try {
					//Thread.sleep(1000);
					System.out.println("credited by : "+Thread.currentThread().getName()+ " balance : "+this.getBalance());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
					System.out.println("Account is overdrawn");
			}
		}
		
	}
	
	//debit example only
	/*public void run()
	{
		for(int i = 0;i < 4;i++)
		{
			this.debit(10);
		}
	}*/
	
	public void run()
	{
		for(int i =0 ; i < 4 ;i++)
		{
			if(Thread.currentThread().getName().equals("Dhruv"))
			{
				System.out.println("Dhruv come for credit");
				this.credit(10);
			}
			else
			{
				System.out.println("Aneri come for debit");
				this.debit(10);
			}
		}
	}
}