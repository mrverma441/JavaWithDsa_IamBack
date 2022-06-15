package practice;

import java.util.Scanner;

public class Power_Of_Two {

	public static boolean PowerOf2(int n)
	{
		if(n==0)
		{
			return false;
		}
		while(n!=1)
		{
			if(n%2==1)
			{
				return false;
			}
			n=n/2;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(PowerOf2(n));
	}
}
