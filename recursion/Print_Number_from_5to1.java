package recursion;

import java.util.Scanner;

public class Print_Number_from_5to1 {

	public static void Print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		Print(n-1);
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
	
		Print(n);
	}
}
