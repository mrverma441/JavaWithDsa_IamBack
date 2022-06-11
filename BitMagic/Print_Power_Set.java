package BitMagic;

import java.util.Scanner;

public class Print_Power_Set {

	public static void Print_Power_Set(String str)
	{
		int n=str.length();
		int Power_Size=(int) Math.pow(2, n);
		for(int counter=0;counter<Power_Size;counter++)
		{
			for(int j=0;j<n;j++)
			{
				if((counter&(1<<j))!=0)
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
		Print_Power_Set(str);
	}
}
