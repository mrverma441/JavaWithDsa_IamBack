package Maths;

import java.util.Scanner;

public class All_Divisor_Of_A_Number {
	public static void Divisor(int n)
	{
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		System.out.println(n);


		
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
		Divisor(n);
	}

}
