package multithreading;

class Join extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try
			{
			  Thread.sleep(1000);	
			}
			catch(Exception e) {}
			System.out.println(i);
		}
	}
}
public class JoinDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main thread is started...");
		Join j1 = new Join();
		Join j2 = new Join();
		Join j3 = new Join();
		
		j1.start();
		j1.join();//Main thread is halt to complete the execution of j1 thread
		j2.join();
		j3.start();
		
		System.out.println("Main thread is ended...");
	}
}

