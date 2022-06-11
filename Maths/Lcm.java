package Maths;

import java.util.Scanner;

public class Lcm {

	public static int lcm(int a,int b)
	{
		int res=Math.max(a, b);
		while(true)
		{
			if(res%a==0&&res%b==0)
			{
				return res;
			}
			res++;
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the two numbers to find their LCM");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("LCM of both the number is "+lcm(a, b));
	}
}
