package Arrays;

import java.util.Scanner;

public class Largest_Element_Gfg {

	public static int getLargest(int array[])
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			boolean flag=true;
			for(int j=0;j<n;j++)
			{
				if(array[j]>array[i])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				return i;
			}
		}
		return -1;
		
		
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
		System.out.println(getLargest(array));

	}
}
