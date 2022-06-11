package Maths;

import java.util.Scanner;

public class Is_Prime_Efficient2 {

	public static boolean is_Prime(int n)
	{
		if(n==1)
		{
			return false;
		}
		if(n==2||n==3)
		{
			return true;
		}
		if(n%2==0||n%3==0)
		{
			return false;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+6)
		{
			if(n%i==0||n%(i+2)==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
		System.out.println(is_Prime(n));
	}
}
