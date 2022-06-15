package practice;

import java.util.Scanner;

public class countsetbits {

	public static int count_Set_Bits(int n)
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
		return res;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(count_Set_Bits(n));
	}
}
