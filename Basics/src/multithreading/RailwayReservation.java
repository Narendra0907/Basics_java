package multithreading;

class Customer implements Runnable
{
    int available = 1;
    int wanted; //1
    public Customer(int wanted)
    {
     this.wanted = wanted;	
    }
    
	@Override
	public void run() 
	{
		System.out.println("Available berth :"+available);
		
		if(available >= wanted)
		{
			String name = Thread.currentThread().getName();
			
			System.out.println(wanted +" berth reserved for :"+name);
			try
			{
				Thread.sleep(500); //ticket is printing
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			available = available - wanted;
		}
		else
		{
			System.out.println("Sorry!! No Berth is available");
		}			
	}
	
}
public class RailwayReservation 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer(1);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		
		t1.setName("Elina");
		t2.setName("Parisha");
		
		t1.start();  t2.start();
		
	}
}
