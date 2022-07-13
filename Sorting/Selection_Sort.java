package Sorting;

public class Selection_Sort {
	public static void selectionSort(int[]array)
	{
		int n=array.length;
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int min_ind=0;
			for(int j=1;j<n;j++)
			{
				min_ind=j;
			}
			temp[i]=array[min_ind];
			array[min_ind]=Integer.MAX_VALUE;
			
			
		}
		for(int i=0;i<n;i++)
		{
			array[i]=temp[i];
		}
	}
	public static void main(String[] args) {
		int[]array= {10,5,8,20,2,18};
		selectionSort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
