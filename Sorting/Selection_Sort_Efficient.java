package Sorting;

public class Selection_Sort_Efficient {
	public static void selectionSort(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			int min_ind=i;
			for(int j=i+1;j<n;j++)
			{
				if(array[j]<array[min_ind])
				{
					min_ind=j;
				}
			}
			int temp=array[min_ind];
			array[min_ind]=array[i];
			array[i]=temp;
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
