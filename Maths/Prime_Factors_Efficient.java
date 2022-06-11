package Maths;

import java.util.Scanner;

public class Prime_Factors_Efficient {

	public static void Print_Factors(int n)
	{
		if(n<=1)
		{
			return ;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
		if(n>1)
		{
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
		Print_Factors(n);
	}
}
