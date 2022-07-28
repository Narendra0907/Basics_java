package multithreading;

class hreadName
{
	public void printThreadName()
	{		
		//This area is accessible by all the threads  
		String name = Thread.currentThread().getName();
		System.out.println("Thread inside the method is :"+name);
		
		   synchronized(this)
		   {			
			for(int i=1; i<=9; i++)
			{
				System.out.println("i value is :"+i+" by :"+name);
			}
			System.out.println(".............................");
		   }
		
	}
}
public class BlockSynchronization 
{
	public static void main(String[] args)
	{
		hreadName tn = new hreadName();
		
		Thread t1 = new Thread()
		{
	       @Override
	       public void run()
	       {
	    	  tn.printThreadName();
	       }
		};
		
		
		Thread t2 = new Thread()
		{
		   @Override
	       public void run()
	       {
	    	  tn.printThreadName();
	       }
		};
		t1.setName("MyThread_1"); t2.setName("MyThread_2");
		t1.start(); t2.start();
		
		
	}
}


