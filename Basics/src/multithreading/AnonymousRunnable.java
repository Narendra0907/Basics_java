package multithreading;

class AnonymousRunnable
{
	public static void main(String [] args)
	{
		Runnable r1 = new Runnable()
		{
					@Override
					public void run()
					{
						System.out.println("Runnable Demo1...");						
					}			
		};		
		Thread t1 = new Thread(r1);			
		t1.start();		
	}
}

