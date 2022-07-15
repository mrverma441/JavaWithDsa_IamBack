package Sorting;

import java.util.Arrays;

public class Chocolate_Distribution_Problem {
	public static int minDifference(int[]array,int m)
	{
		int n=array.length;
		if(m>n)
		{
			return -1;
		}
		Arrays.sort(array);
		int res=array[m-1]-array[0];
		for(int i=1;(i+m-1)<n;i++)
		{
			res=Math.min(res, array[i+m-1]-array[i]);
		}
		return res;
	}
	public static void main(String[]args)
	{
		int[]array= {7,3,2,4,9,12,56};
		int[]array2= {3,4,1,9,56,7,9,12};
		int m=5;
		System.out.println(minDifference(array2, m));
	}

}
