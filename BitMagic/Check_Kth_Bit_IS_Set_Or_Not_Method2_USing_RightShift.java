package BitMagic;

import java.util.Scanner;

public class Check_Kth_Bit_IS_Set_Or_Not_Method2_USing_RightShift {

	public static void Kth_Bit(int n,int k)
	{
		if((n>>(k-1)&1)==1)
		{
			System.out.println("Yes Kth bit is set ");
		}
		else
		{
			System.out.println("No,Kth value is not set ");
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n and k");
		int n=obj.nextInt();
		int k=obj.nextInt();
		Kth_Bit(n, k);
	}
}
