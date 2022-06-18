package Arrays;

import java.util.Scanner;

public class Second_Largest_Naive {

	public static int secondLargest(int array[])
	{
		int largest=getLargest(array);
		int res=-1;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=array[largest])
			{
				if(res==-1)
				{
					res=i;
				}
				else if(array[i]>array[res])
				{
					res=i;
				}
			}
		}
		return res;
	}
	public static int getLargest(int array[])
	{
		int largest=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>array[largest])
			{
				largest=i;
			}
		}
		return largest;
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
		System.out.println(secondLargest(array));

	}
	
}
