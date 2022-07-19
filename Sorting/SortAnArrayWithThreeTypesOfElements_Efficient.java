package Sorting;

public class SortAnArrayWithThreeTypesOfElements_Efficient {
	public static void sort(int[]array)
	{
		int n=array.length;
		int low=0;
		int high=n-1;
		int mid=0;
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
		sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
