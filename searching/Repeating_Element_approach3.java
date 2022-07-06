package Searching;

import java.util.Arrays;

public class Repeating_Element_approach3 {
	public static int repeatElement(int[]array)
	{
		int n=array.length;
		Arrays.sort(array);
		for(int i=0;i<n-1;i++)
		{
			if(array[i]==array[i+1])
			{
				return array[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {0,2,1,3,2,2};
		int[]array2= {1,2,3,0,3,4,5};
		int[]array3= {0,0};
		System.out.println(repeatElement(array));
	}

}
