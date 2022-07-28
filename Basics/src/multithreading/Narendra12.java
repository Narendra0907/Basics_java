package multithreading;


class Narendra1 implements Runnable {
                        @Override
                          public void run(){
                             System.out.println(Thread.currentThread().getName());
                             }
}
               public  class Narendra12{
             public static  void  main (String[] args){
                      
          	   Narendra1 r=new Narendra1();
          	   
                            Thread t1=new Thread(r);
                            Thread t2=new Thread(r); 
                             Thread t3=new Thread(r);
                             
                                   t1.setName("first name");
                                    t2.setName("second name");
                                    t3.setName("thread name");
                                    
                                      t1.start();
                                       t2.start(); 
		                                 t3.start();
		}
	}
