package Searching;

public class Index_Of_First_Occurence_Using_Recursion {
	public static int firstOccurence(int[]array,int low,int high,int x)
	{
		if(low>high)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(array[mid]>x)
		{
			return firstOccurence(array, low, mid-1, x);
			
		}
		else if(array[mid]<x)
		{
			return firstOccurence(array, mid+1, high, x);
		}
		else
		{
			if(mid==0||array[mid-1]!=array[mid])
			{
				return mid;
			}
			else
			{
				return firstOccurence(array, low, mid-1, x);
			}
		}
	}
	public static void main(String[] args) {
		int[]array= {1,10,10,10,20,20,40,50,60,70,70,70,70};
		int n=array.length;
		System.out.println(firstOccurence(array,0, n-1,70));
	}

}
