package Maths;

import java.util.Scanner;

public class Count_Number_Of_Digit_In_a_Number {
	public static void Find_Number(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("n having "+count+" digits");
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		Find_Number(n);
		
	}

}
