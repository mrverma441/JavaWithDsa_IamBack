package Maths;

import java.util.Scanner;

public class Trailing_Zeroes_In_Factorial {

	public static long Trailing_Zeroes(long n)
	{
		int fact=1;
		for(int i=1;i<n;i++)
		{
			fact+=fact*i;
		}
		int count=0;
		while(fact%10==0)
		{
			count++;
			fact=fact/10;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
		System.out.println(Trailing_Zeroes(n));
	}
}
