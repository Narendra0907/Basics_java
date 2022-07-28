package multithreading;

public class AnonymousThread
{
public static void main(String args[])
{
	Thread t1 = new Thread() //with reference
	 {
		@Override
	    public void run()
		{
		    System.out.println("Thread1 is Running");
		}
	};
		t1.start();	
		

		
		new Thread()  //without reference
		{
			@Override
			public void run()
			{
				System.out.println("Thread2 is Running");
			}
		}.start();	
   }
}
