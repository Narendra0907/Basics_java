package multithreading;

public class MainPriority 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
			
		System.out.println("Main thread priority is :"+t.getPriority()); 
		
		Thread t1 = new Thread();
		System.out.println("User thread priority is :"+t1.getPriority()); 
	}

}


