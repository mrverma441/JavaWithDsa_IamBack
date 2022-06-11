package Maths;

import java.util.Scanner;

public class Factorial_Iteration {
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<n;i++)
		{
			fact+=fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		System.out.println(factorial(n));

		
		
	}

}
