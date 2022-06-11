package Maths;

import java.util.Scanner;

public class Palind_rome {
	public static boolean isPal(int n)
	{
		int n1=n;
		int rev=0;
		while(n1!=0)
		{
			int rem=n1%10;
			rev=rev*10+rem;
			n1=n1/10;
			
		}
		if(rev==n)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number to check it is palindrome or not");
		int n=obj.nextInt();
		System.out.println(isPal(n));
	}
}
