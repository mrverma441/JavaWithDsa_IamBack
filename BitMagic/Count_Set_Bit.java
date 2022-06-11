package BitMagic;

import java.util.Scanner;

public class Count_Set_Bit {

	public static void Count_set_Bit(int n)
	{
		
		int res=0;
		while(n>0)
		{
			if(n%2!=0)
			{
				res++;
			}
			n=n/2;
		}
	  System.out.println(res);
		
		
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		Count_set_Bit(n);
	}
}
