package Maths;

import java.util.Scanner;

public class Prime_Efficient_Method {

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
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number to check it is prime or not");
		int a=obj.nextInt();
		System.out.println(isPrime(a));
	}
}
