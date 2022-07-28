package multithreading;

class ThreadPrior1 extends Thread
{
	@Override
	public void run()
	{
		int count=0;
		for(int i=1; i<=1000000; i++)
		{
		  count++;	
		}
		
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

	}	
	
	public static void main(String args[])
	{
		ThreadPrior1 m1 = new ThreadPrior1();
		ThreadPrior1 m2 = new ThreadPrior1();
		
		m1.setPriority(Thread.MIN_PRIORITY);//1
		m2.setPriority(Thread.MAX_PRIORITY);//10	
		
		m1.setName("Last");
		m2.setName("First");	
		
		m1.start();
		m2.start();
	}
}   

