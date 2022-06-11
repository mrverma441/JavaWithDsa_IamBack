package BitMagic;

import java.util.Scanner;

public class Check_Kth_Bit_Is_Set_Or_Not_Using_LeftShift {

	public static void Kth_Bit(int n,int k)
	{
		
		if((n&1<<(k-1))!=0)
		{
		
			System.out.println("YEs Kth bit is set");
		}
		else 
		{
			System.out.println("No,Kth bit is not set");
		}
		
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println("Enter the value of x");
		int x=obj.nextInt();
		Kth_Bit(n, x);
		
		
	}
}
