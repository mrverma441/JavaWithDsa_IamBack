package Arrays;

import java.util.Scanner;

public class Smallest_element {

	public static void Smallest(int[] array)
	{
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("Smallest element is:= "+min);
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
		Smallest(array);

	}
}
