package practice;

import java.util.Scanner;

public class Find_Only_Odd_Occuring_Number {

	public static void FindOddOccuring(int array[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int count=0;

			for(int j=0;j<n;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
			}
			if(count%2!=0)
			{
				System.out.println(array[i]);
			}
		}
		

	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		//int[]array= {4,3,4,4,4,5,5};
		int[]array= {3,4,3,4,5,4,4,6,7,7};

		int n=array.length;
		FindOddOccuring(array, n);
	}
}
