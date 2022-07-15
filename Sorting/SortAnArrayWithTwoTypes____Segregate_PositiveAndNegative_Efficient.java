package Sorting;

import java.lang.reflect.Array;

public class SortAnArrayWithTwoTypes____Segregate_PositiveAndNegative_Efficient {
	
	public static void segregatePosNeg(int[]array)
	{
		int n=array.length;
		int i=-1;
		int j=n;
		while(true)
		{
			do
			{
				i++;
			}while(array[i]<0);
			do
			{
				j--;
			}while(array[j]>=0);
			if(i>=j)
				return;
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
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
