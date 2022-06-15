package practice;

import java.util.Scanner;

public class PowerSet {

	public static void Powerset(String str)
	{
		int n=str.length();
		int power=(int) Math.pow(2, n);
		for(int i=0;i<power;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i&(1<<j))!=0)
				{
					System.out.print(str.charAt(j));
				}
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=obj.next();
		Powerset(str);
	}
}
