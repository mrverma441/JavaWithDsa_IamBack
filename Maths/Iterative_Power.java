package Maths;

import java.util.Scanner;

public class Iterative_Power {

	public static int Power(int x,int n)
	{
		int res=1;
		while(n>0)
		{
			if(n%2!=0)
			{
				res=res*x;
			}
			x=x*x;
			n=n/2;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=obj.nextInt();
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(Power(x, n));
		
	}
}
