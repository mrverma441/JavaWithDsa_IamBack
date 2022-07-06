package Searching;

public class Binary_Search_Recursive {
	public static int bSearchRecursive(int[]array,int x,int low,int high)
	{
		int mid=(low+high)/2;
		if(low>high)
		{
			return -1;
		}
		if(array[mid]==x)
		{
			return mid;
		}
		else if(array[mid]>x)
		{
			return bSearchRecursive(array, x,low,mid-1);

		}
		else 
		{
			return bSearchRecursive(array, x, mid+1,high);

			
		}
	
		
			
			
	}

	public static void main(String[] args) {
		int[]array= {10,20,30,40,50};
		int n=array.length;
		int j=bSearchRecursive(array, 40, 0,n-1 );
		System.out.println(j);
		
	}
}
