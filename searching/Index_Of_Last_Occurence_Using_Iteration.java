package Searching;

public class Index_Of_Last_Occurence_Using_Iteration {
	public static int lastOccurence(int[]array,int x)
	{
		int n=array.length;
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]>x)
			{
				high=mid-1;
			}
			else if(array[mid]<x)
			{
				low=mid+1;
			}
			else
			{
				if(mid==n-1||array[mid]!=array[mid+1])
				{
					return mid;
				}
				else
				{
					low=mid+1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {10,20,30,30,30,40,40,40};
		int n=array.length;
		System.out.println(lastOccurence(array, 30));

	}

}
