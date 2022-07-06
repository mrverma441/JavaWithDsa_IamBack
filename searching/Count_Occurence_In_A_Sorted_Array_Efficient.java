package Searching;
public class Count_Occurence_In_A_Sorted_Array_Efficient {
	public static int counOccurece(int[]array,int x)
	{
		int n=array.length;
		int first=firstOcc(array,n,x);
		
		if(first==-1)
		{
			return 0;
		}
		else
		{
			return (lastOccurence(array,x)-first+1);
		}
		
		
    }
	
	public static int firstOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(arr[mid]>x)

				high=mid-1;
			else if(arr[mid]<x)
				low = mid + 1;

			else
			{
				if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;

				else
					high = mid - 1;
			}

		}

		return -1;
	}
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
		int[]array1= {10,20,20,20,30,30};
		System.out.println(lastOccurence(array1, 20));
	}
}
