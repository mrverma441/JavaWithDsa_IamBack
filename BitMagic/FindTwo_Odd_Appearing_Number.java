package BitMagic;

import java.util.Scanner;

public class FindTwo_Odd_Appearing_Number {

	static void oddAppearing(int array[],int n)
	{
		int XOR=0,res1=0,res2=0;
		for(int i=0;i<n;i++)
		{
			XOR=XOR^array[i];
		}
		int Sn=XOR&~(XOR-1);
		for(int i=0;i<n;i++)
		{
			if((array[i]&Sn)!=0)
			{
				res1=res1^array[i];
				
			}
			else
			{
				res2=res2^array[i];
			}
		}
		System.out.println(res1+" "+res2);
		
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		//int[]array= {3,4,3,4,5,4,4,6,7,7};
		int[]array= {20,15,20,16};
		int n=array.length;
	    oddAppearing(array,n);
	}
}
