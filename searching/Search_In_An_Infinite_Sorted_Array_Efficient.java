package Searching;

public class Search_In_An_Infinite_Sorted_Array_Efficient {

	public static int bSearch(int[]array,int x,int low,int high)
	{
		int n=array.length;
		
		 low=0;
		high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==x)
			{
				return mid;
			}
			else if(array[mid]>x)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}
	public static int search(int[]array,int x)
	{
		if(array[0]==x)
		{
			return 0;
		}
		int i=1;
		while(array[i]<x)
		{
			i=i*2;
		}
		if(array[i]==x)
		{
			return i;
		}
		return bSearch(array, x,i/2+1,i-1);
	}
	public static void main(String[] args) {
		int[]array= {1,10,15,20,40,80,90,100,120,500};
		System.out.println(search(array, 100));
	}
}
