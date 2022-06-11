package Maths;

import java.util.Scanner;

public class Computing_Power {

	public static int Power(int x,int n)
	{
		int res=1;
		for(int i=0;i<n;i++)
		{
			res=res*x;
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
