package Searching;

public class Binary_Searching_Iterative {
	public static int bSearch(int[]array,int x)
	{
		int n=array.length;
		
		int low=0;
		int high=n-1;
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
	public static void main(String[] args) {
		int[]array= {10,20,30,40,50};
		System.out.println(bSearch(array, 50));
	}

}
