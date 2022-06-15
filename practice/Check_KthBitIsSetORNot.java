package practice;

import java.util.Scanner;

public class Check_KthBitIsSetORNot {

	public static void KthBit(int n,int k)
	{
		if((n&(1<<(k-1)))==1)
		{
			System.out.println("Yes, Kth Bit is Set");
		}
		else
		{
			System.out.println("No, Kth Bit is not set");
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n and k");
		int n=obj.nextInt();
		int k=obj.nextInt();
		KthBit(n, k);
		
	}
}
