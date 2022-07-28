package COLLECTION;
//Serialization  
import java.io.*;  
import java.util.*;  
class ArrayListDemo4
	 {  
      public static void main(String [] args)  
       {  
         ArrayList<String> al=new ArrayList<String>();  
         al.add("Nagpur");    
         al.add("Vijaywada");    
         al.add("Hyderabad");
		   al.add("Jamshedpur");            
        try  
        {  
				//Serialization  
				FileOutputStream fos=new FileOutputStream("City.txt");  
				ObjectOutputStream oos=new ObjectOutputStream(fos);  
				 oos.writeObject(al);  
				 fos.close();  
				 oos.close();  
				//Deserialization  
				FileInputStream fis=new FileInputStream("City.txt");  
				ObjectInputStream ois=new ObjectInputStream(fis);  

				ArrayList  list=(ArrayList)ois.readObject();  
				System.out.println(list);    
        }
		  catch(Exception e)  
        {  
            System.err.println(e);  
        }  
     }  
  }         

