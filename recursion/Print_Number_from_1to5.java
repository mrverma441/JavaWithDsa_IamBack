package recursion;

import java.util.Scanner;

public class Print_Number_from_1to5 {

	public static void print(int n)
	{
		if(n==6)
		{
			return;
			
		}
		System.out.println(n);//print(n-1);
		
		print(n+1);//syso(n);
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
		print(n);
	}
}
