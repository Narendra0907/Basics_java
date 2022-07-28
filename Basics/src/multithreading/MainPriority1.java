package multithreading;

class ThreadP extends Thread
{
	@Override
	public void run()
	{
	  int priority = Thread.currentThread().getPriority();
	  
	  System.out.println("Child Thread priority is :"+priority);
	}
}
public class MainPriority1 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();		
		t.setPriority(9);  
	//t.setPriority(11); //Invalid will throw Java.lang.IllegalArgumentException
		
		System.out.println("Main thread priority is :"+t.getPriority()); 		
		ThreadP t1 = new ThreadP();
		t1.start();		
	}
}


