package Sorting;

public class Sort012Using_ExtendVersionOf_Hoare {
	public static void sort012(int[]array)
	{
		int n=array.length;
		int low=0;
		int mid=0;
		int high=n-1;
		while(mid<=high)
		{
			if(array[mid]==0)
			{
				int temp=array[low];
				array[low]=array[mid];
				array[mid]=temp;
				low++;
				mid++;
			}
			else if(array[mid]==1)
			{
				mid++;
			}
			else
			{
				int temp=array[mid];
				array[mid]=array[high];
				array[high]=temp;
				high--;
			}
		}
	}
	public static void main(String[]args)
	{
		int[]array= {0,1,0,2,1,2};
		sort012(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
