package practice;

import java.util.Arrays;

public class Second_Largest_ {

	public static void main(String[]args)
	{
		int[]array= {10,5,8,20};
		Arrays.sort(array);
		System.out.println("Second largest element is "+array[array.length-2]);
		
	}
}
