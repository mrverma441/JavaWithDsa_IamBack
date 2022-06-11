package BitMagic;

import java.util.Scanner;

public class Count_set_Bits {

	public static int Count_Bits(int n)
	{
		int res=0;
		while(n>0)
		{
			n=(n&(n-1));
			res++;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(Count_Bits(n));
	}
	
}
