package Sorting;

import java.util.Arrays;

public class Minimum_Difference_In_An_Array_Efficient {
	public static int getMinDiff(int[]array)
	{
		int n=array.length;
		Arrays.sort(array);
		int res=Integer.MAX_VALUE;
		for(int i=1;i<n;i++)
		{
			res=Math.min(res, array[i]-array[i-1]);
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {1,8,12,5,18};
		System.out.println(getMinDiff(array));
	}

}
