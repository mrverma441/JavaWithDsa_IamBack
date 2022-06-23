package practice;

import java.lang.reflect.Array;

public class Check_If_An_Array_IsSorted {

	public static boolean isSorted(int[]array)
	{
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<array[i-1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[]array= {8,12,15};
		System.out.println(isSorted(array));
	}
}
