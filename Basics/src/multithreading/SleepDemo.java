package multithreading;

class Sleep extends Thread
{
	@Override
	public void run() 
	{	
		for(int i =1; i<=10; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("i value is :"+i);
		}
	}	
}
public class SleepDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Thread started..");
		Sleep s1 = new Sleep();
		s1.start();	
	
	}
}

