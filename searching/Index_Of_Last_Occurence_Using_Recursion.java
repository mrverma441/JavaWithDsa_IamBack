package Searching;

public class Index_Of_Last_Occurence_Using_Recursion {
	public static int lastOccurence(int[]array,int low,int high,int x)
	{
		if(low>high)
		{
			return -1;
		}
		int n=array.length;
		int mid=(low+high)/2;
		if(array[mid]>x)
		{
			return lastOccurence(array, low, mid-1, x);
		}
		else if(array[mid]<x)
		{
			return lastOccurence(array, mid+1, high, x);
		}
		else
		{
			if(mid==n-1||array[mid]!=array[mid+1])
			{
				return mid;
			}
			else
			{
				return lastOccurence(array, mid+1, high, x);

			}
		}
	}
	public static void main(String[] args) {
		int[]array= {10,20,30,40,40,40};
		int n=array.length;
		System.out.println(lastOccurence(array,0,n-1, 40));
	}

}
