package Arrays;

import java.util.Scanner;

public class Largest_element_index_efficient {

	public static int GetLargest(int[]array)
	{
		int res=0;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>array[res])
			{
				res=i;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=obj.nextInt();
		int array[]=new int[n];

		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println(GetLargest(array));

	}
}
