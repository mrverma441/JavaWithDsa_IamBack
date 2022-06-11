package Maths;

import java.util.Scanner;

public class LCM_Using_Euclidean {

	public static int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}
	public static int gcd(int a, int b) {
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the two numbers to find their LCM");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("LCM of both the number is "+lcm(a, b));
	}
}
