package practice;

import java.util.Scanner;

public class FindOddOccuring {

	public static int FindODDOCC(int array[],int n)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			 res=res^array[i];
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int[]array= {4,3,4,4,4,5,5};
		int n=array.length;

		System.out.println(FindODDOCC(array, n));
	}
}
