package recursion;

import java.util.Scanner;

public class Print_Sum_Of_First_N_Natural_Number {

	public static void Print(int i,int n,int sum)
	{
		if(i>n)
		{
			//sum=sum+i;
			System.out.println(sum);
			return;
		}
		sum=sum+i;
		Print(i+1,n,sum);
	}
	public static void main(String[] args) {
		Print(1,10,0);
	}
}
