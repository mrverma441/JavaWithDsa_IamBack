package Sorting;

import java.util.Arrays;

public class Union_Of_Two_Sorted_Arrays {
	public static void printUnion(int[]a,int[]b)
	{
		int m=a.length;
		int n=b.length;
		int c[]=new int[m+n];
		for(int i=0;i<m;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			c[m+i]=b[i];
		}
		Arrays.sort(c);
		for(int i=0;i<m+n;i++)
		{
			if(i==0||c[i]!=c[i-1])
			{
				System.out.print(c[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {3,5,8};
		int[]b= {2,8,9,10,15};
		printUnion(a, b);
	}

}
