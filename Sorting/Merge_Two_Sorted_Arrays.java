package Sorting;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays {
	public static void merge(int[]a,int[]b)
	{
		int m=a.length;
		int n=b.length;
		int[]c=new int[m+n];
		for(int i=0;i<m;i++)
		{
			c[i]=a[i];
			
		}
		for(int i=0;i<n;i++)
		{
			c[m+i]=b[i];
			
		}
		Arrays.sort(c);
		for(int i=0;i<(m+n);i++)
		{
			System.out.print(c[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[]a= {10,15,20};
		int[]b= {5,6,6,15};
		merge(a, b);
	}

}
