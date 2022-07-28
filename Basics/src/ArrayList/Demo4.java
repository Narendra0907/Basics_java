package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> abc=new ArrayList<>();
		abc.add(12);
		abc.add(13);
		abc.add(14);
		abc.add(15);
		ListIterator itr=abc.listIterator();
		While(itr.hasPrevious());
		{
System.out.println("------------");
	}

}

	private static void While(boolean hasPrevious) {
		// TODO Auto-generated method stub
		
	}

}
	
