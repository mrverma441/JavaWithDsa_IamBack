package Maths;

import java.util.Scanner;

public class Count_Digit_Using_Recursion {

	public static int Find_Digit(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return 1+ Find_Digit(n/10);
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(Find_Digit(n));
	}
}
