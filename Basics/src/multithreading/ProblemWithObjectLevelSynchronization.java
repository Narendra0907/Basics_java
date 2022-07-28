package multithreading;

class PrintTable
{
	    public synchronized void printTable(int n)
	    {
	       for(int i=1; i<=10; i++)
	       {
	    	   System.out.println(n+" X "+i+" = "+(n*i));
	    	   try
	    	   {
	    		   Thread.sleep(1000);
	    	   }
	    	   catch(Exception e)
	    	   {
	    		   
	    	   }
	       }
	       System.out.println(".......................");
	    }
	
}

public class ProblemWithObjectLevelSynchronization
{
	public static void main(String[] args) 
	{
		PrintTable pt1 = new PrintTable();
		
		PrintTable pt2 = new PrintTable();
		
		Thread t1 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(2);	
			       }			   
				};
		        t1.start();
		        
		        Thread t2 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(4);	
			       }			   
				};
		        t2.start();
		        
		        
		        Thread t3 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(6);	
			       }			   
				};
		        t3.start();
		        
		        Thread t4 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(5);	
			       }			   
				};
		        t4.start();
	}

}
