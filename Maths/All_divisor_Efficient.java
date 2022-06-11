package Maths;

import java.util.Scanner;

public class All_divisor_Efficient {

	public static void Print_Divisor(int n)
	{
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				if(i!=n/i)
				{
					System.out.println(n/i);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
	
		Print_Divisor(n);
	}
}
