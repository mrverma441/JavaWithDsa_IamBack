package Maths;

import java.util.Scanner;

public class Prime_factors {

	public static boolean isPrime(int n)
	{
		if(n==1)
		{
			return false;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void Prime_Factors(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(isPrime(i))
			{
				int temp=i;
				while(n%temp==0)
				{
					System.out.println(i);
					temp=temp*i;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
		Prime_Factors(n);

	}
}
