package multithreading;

class Test extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" thread is running...");	
	}
}
public class ThreadName 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		Test t2 = new Test();
		t1.start();			
		t2.start();	
		System.out.println(Thread.currentThread().getName()+" thread is running...");
	}
}

