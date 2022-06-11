package Maths;

import java.util.Scanner;

public class HCF_Using_Euclidean_algorithm {

	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a and b ");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("Hcf of both the number is "+gcd(a, b));
	}
}
