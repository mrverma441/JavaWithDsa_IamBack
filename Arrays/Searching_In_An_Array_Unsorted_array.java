package Arrays;

import java.util.Scanner;

public class Searching_In_An_Array_Unsorted_array {

	public static int Search(int[]array,int n,int x)
	{
		for(int i=0;i<n;i++)
		{
			if(array[i]==x)
			{
				System.out.print("Element is found at the index ");
				return i;
			}
		
		}
		return -1;

		
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=obj.nextInt();
		int []array=new int[n];
		System.out.println("Enter the elements in the array");
		
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println("Enter the elements to be searched in the array");
		int x=obj.nextInt();
		
		System.out.println(Search(array, n, x));
		
		
	}
}
