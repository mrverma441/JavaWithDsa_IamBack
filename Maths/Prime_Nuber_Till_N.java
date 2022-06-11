package Maths;

import java.util.Scanner;

public class Prime_Nuber_Till_N {
	public static boolean is_Prime(int n)
	{
		if(n==1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
	public static void Prime_Nuber_Till_N(int n) {
		for(int i=2;i<=n;i++)
		{
		
			if(is_Prime(i))
			{
				System.out.println(i);
			}
		}
	}


   public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=obj.nextInt();
	Prime_Nuber_Till_N(n);
}
}
