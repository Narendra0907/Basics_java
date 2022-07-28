package multithreading;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("I am child thread created by main thread");
	}
}
public class UserThread
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started...");
		
		MyThread m1 = new MyThread();	
		         m1.start();//creating a new Thread and calling run() method
		        
	    System.out.println("Main method Ended...");
	}
}

