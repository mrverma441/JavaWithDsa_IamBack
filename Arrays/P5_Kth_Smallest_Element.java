package Arrays;

import java.util.Arrays;

public class P5_Kth_Smallest_Element {

	public static  int KthSmallest(int[]array,int k)
	{
		Arrays.sort(array);
		return array[k-1];
	}
	public static void main(String[] args) {
		int[]array= {7,10,4,20,15};
		System.out.println(KthSmallest(array, 4));
		
	}
}
