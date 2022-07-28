package multithreading;

class Hello extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Child Thread is :"+name); 
	}
}
public class UserThread1
{	
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Parent Thread is :"+name);
		
		Hello h1 = new Hello();
		h1.start();//Thread-0
		
		Hello h2 = new Hello();
		h2.start();//Thread-1
	}
}
