package BitMagic;

import java.util.Scanner;

public class Count_Set_Bit2 {

	public static void Count_Set_Bit(int n)
	{
		int res=0;
		while(n>0)
		{
			if((n&1)==1)
			{
				res++;
			}
			n=n>>1;
		}
		
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		Count_Set_Bit(n);
	}
}
