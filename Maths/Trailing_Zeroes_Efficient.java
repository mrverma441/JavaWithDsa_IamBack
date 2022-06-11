package Maths;

import java.util.Scanner;

public class Trailing_Zeroes_Efficient {

	public static int CountZeroes(int n)
	{
		int res=0;
		for(int i=5;i<=n;i=i*5)
		{
			res=res+(n/i);
		}
		return res;
	}
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		System.out.println(CountZeroes(n));
	}
}
