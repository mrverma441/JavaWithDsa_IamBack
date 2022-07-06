package Searching;

public class Search_In_Sorted_Rotated_Array_Efficient {
	public static int search(int[]array,int x)
	{
		int low=0;
		int high=array.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==x)
			{
				return mid;
			}
			if(array[mid]>array[low])
			{
				if(x>=array[low]&&x<array[mid])
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
				
			}
			else
			{
				if(x>array[mid]&&x<=array[high])
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {10,20,30,40,50,8,9};
		int[]array1= {100,200,300,10,20};
		System.out.println(search(array,30));

	}

}
