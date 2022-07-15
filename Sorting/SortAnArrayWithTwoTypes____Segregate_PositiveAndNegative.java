package Sorting;

import java.lang.reflect.Array;

public class SortAnArrayWithTwoTypes____Segregate_PositiveAndNegative {
	public static void segregatePosNeg(int[]array)
	{
		int n=array.length;
		int i=0;
		int temp[]=new int[n];
		for(int j=0;j<n;j++)
		{
			if(array[j]<0)
			{
			
				temp[i]=array[j];
				i++;
			}
			
		}
		for(int j=0;j<n;j++)
		{
			if(array[j]>=0)
			{
				temp[i]=array[j];
				i++;
			}
		}
		for(int j=0;j<n;j++)
		{
			array[j]=temp[j];
		}
	}
	public static void main(String[]args)
	{
		int[]array1= {15,-3,-2,18};
	
		segregatePosNeg(array1);
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
	}

}
