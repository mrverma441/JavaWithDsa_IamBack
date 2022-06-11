package Maths;

import java.util.Scanner;

public class Computing_Power_Efficient {

	public static int Power(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int temp=Power(x,n/2);
		temp=temp*temp;
		if(n%2==0)
		{
			return temp;
		}
		return temp*x;
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
