package Maths;

import java.util.Scanner;

public class Palindrome {
	public static boolean Palindrome(int number)
	{
		int number2=number;
		int rem;
		int rev=0;
		while(number2!=0)
		{
			rem=number2%10;
			rev=rev*10+rem;
			number2=number2/10;
		}
		if(number==rev)
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
		System.out.println("Enter a number to check it is palindrome or not ");
		int number=obj.nextInt();
		System.out.println(Palindrome(number));
		
	}

}
