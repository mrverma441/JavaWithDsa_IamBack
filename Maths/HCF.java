package Maths;

import java.util.Scanner;

public class HCF {

	public static int Hcf(int a,int b)
	{
		int res=Math.min(a, b);
		while(res>0)
		{
			if(a%res==0&&b%res==0)
			{
				break;
			}
			res--;
		}
		return res;
	}
	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a and b to find hcf");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("HCF of both number is "+Hcf(a, b));
	}

}
