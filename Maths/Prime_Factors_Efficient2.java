package Maths;

import java.util.Scanner;

public class Prime_Factors_Efficient2 {

	public static void print_Factors(int n)
	{
		if(n<=1)
		{
			return;
		}
		while(n%2==0)
		{
			System.out.println(2);
			n=n/2;
		}
		while(n%3==0)
		{
			System.out.println(3);
			n=n/3;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+6)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;

			}
			while(n%(i+2)==0)
			{
				System.out.println(i+2);
				n=n*(i+2);
			}
		}
		if(n>3)
		{
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
		print_Factors(n);
	}
}
