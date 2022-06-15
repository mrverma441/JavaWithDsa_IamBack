package practice;

import java.util.Scanner;

public class PowerOf2 {

	public static boolean PowerOftwo(int n)
	{
		if(n==0)
		{
			return false;
		}
		return ((n&(n-1))==0);
		
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(PowerOftwo(n));
	}
}
