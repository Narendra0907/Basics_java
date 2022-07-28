package multithreading;

class Sample extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName(); 
	    
	    for(int i = 1; i<=10; i++)
	    {
	    	System.out.println("i value is :"+i+" by "+name+" thread" );
	    }	   
	}
}
public class ThreadLoop 
{	
	public static void main(String[] args) 
	{
	    System.out.println("Main thread started.....");
	    
	    String name = Thread.currentThread().getName();
	    
	    for(int i = 1; i<=10; i++)
	    {
	    	System.out.println("i value is :"+i+" by "+name+ " thread");	   
	    } 
	    
	    Sample s = new Sample();
	    s.setName("Child");
	    s.start();  //child thread is created here which is calling the run() method  	    
	   
	     int x =1;
	     do
	     {
	    	System.out.println("Hello");
	    	x++;
	     }
	     while(x<=10);
	    
	}
}

