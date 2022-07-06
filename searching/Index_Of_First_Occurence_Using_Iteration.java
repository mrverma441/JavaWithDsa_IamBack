package Searching;

public class Index_Of_First_Occurence_Using_Iteration {

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
	public static void main(String[] args) {
		int[]array= {1,10,10,10,20,20,40,50,60,70,70,70,70};
		int n=array.length;
		System.out.println(firstOcc(array,n,70));
	}
	

}
