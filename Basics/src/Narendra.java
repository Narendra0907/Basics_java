
      class Narendra implements Runnable {
                              @Override
                                public void run(){
                                   System.out.println(Thread.currentThread().getName());
                                   }
    }
                     public  class Narendra{
                   public static  void  main (String[] args){
                            
                	   Narendra r=new Narendra();
                	   
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
