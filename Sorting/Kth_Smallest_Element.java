package Sorting;

import java.util.Arrays;

public class Kth_Smallest_Element {
	public static int KthSmallest(int[]array,int k)
	{
	
		Arrays.sort(array);
		return array[k-1];
	}
	public static void main(String[] args) {
		int[]array= {10,5,30,12};
		int k=2;
		System.out.println(KthSmallest(array, k));
		
		
	}

}
