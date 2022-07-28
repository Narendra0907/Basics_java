package ArrayList;
import java.util.ArrayList;

public class Demo3 {

	public static void main (String [] args)
	{
		ArrayList<Integer> abc=new ArrayList<>();
		abc.add(12);
		abc.add(13);
		abc.add(14);
		abc.add(15);
		ArrayList<Integer> abc2=abc;
		System.out.println("------------");
		for(Integer value:abc2) {
			System.out.println(value);
			abc2.set(2, 100);
			System.out.println(abc.get(2));
			System.out.println(abc2.get(2));
			
		}
		
		
	}
}
