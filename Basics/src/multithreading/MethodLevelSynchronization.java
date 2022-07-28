package multithreading;

class Table 
{
    public synchronized void printTable(int n)
    {
       for(int i=1; i<=20; i++)
       {
    	   System.out.println(n+" X "+i+" = "+(n*i));
    	   try
    	   {
    		   Thread.sleep(3000);
    	   }
    	   catch(Exception e)
    	   {
    		   
    	   }
       }
       System.out.println(".......................");
    }
}
public class MethodLevelSynchronization 
{
	public static void main(String[] args)
	{
		Table t = new Table();
		
		Thread t1 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   t.printTable(13);
			       }
				};
				
				
		Thread t2 = new Thread()
				{
				   @Override
			       public void run()
			       {
			    	   t.printTable(10);
			       }
				};
				
				t1.start(); t2.start();
	}
}
