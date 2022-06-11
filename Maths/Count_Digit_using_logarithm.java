package Maths;

import java.util.Scanner;

public class Count_Digit_using_logarithm {
	public static int count_Digit(int n)
	{
		return (int) Math.floor(Math.log10(n)+1);
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(count_Digit(n));
	}
}
