package ArrayList;

public class Demo {
	
	public static void main (String [] args )
	{
		int maxValue=Integer.MIN_VALUE;
		int[] arr= {2,3,4,5,6,7,8,9,10};
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i] > maxValue) {
				maxValue=arr[i];
			}
	}
		System.out.println(maxValue);
	}
}
