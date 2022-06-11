package Maths;

import java.util.Scanner;

public class Prime_Number_Till_N_Efficient {

	public static void PrimeTillN(int n)
	{
		boolean prime[]=new boolean[n+1];
		for(int i=0;i<=n;i++)
		{
			prime[i]=true;
		}
		for(int j=2;j<=Math.sqrt(n);j++)
		{
			if(prime[j]==true)
			{
				for(int i=j*j;i<=n;i+=j)
				{
					prime[i]=false;
					//System.out.println(i);
				}
			}
		}
		  for (int i = 2; i <= n; i++) {
	            if (prime[i] == true)
	                System.out.print(i + " ");
	        }
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=obj.nextInt();
		PrimeTillN(n);
	}
}
