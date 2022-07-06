package Searching;

public class Peak_Element_Efficient {
	public static int  getPeak(int[]array)
	{
		int n=array.length;
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(mid==0||array[mid-1]<=array[mid]&&mid==n-1||array[mid+1]<=array[mid])
			{
				return mid;
			}
			if(mid>0&&array[mid-1]>=array[mid])
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
		int[]array= {5,10,20,15,7};
		int[]array1= {10,20,15,5,23,90,67};
		System.out.println(getPeak(array));

	}

}
