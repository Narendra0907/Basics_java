package ArrayList;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
    
		ArrayList<String> liststrings=new ArrayList<String>();
		liststrings.add("narend"
				+ "ra");
		liststrings.add("surendra");
		liststrings.add("nagendra");
		liststrings.add("funendra");
		liststrings.add("sunendra");
		System.out.println("before");
		System.out.println(liststrings);
		liststrings.remove(3);
		System.out.println("after");
		System.out.println(liststrings);
	}

}
