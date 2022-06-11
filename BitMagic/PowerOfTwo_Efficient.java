package BitMagic;

import java.util.Scanner;

public class PowerOfTwo_Efficient {

	public static boolean Power_Of_Two(int n)
	{
		if(n==0)
		{
			 return false;
		}
		return ((n&(n-1))==0);
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(Power_Of_Two(n));
	}
}
