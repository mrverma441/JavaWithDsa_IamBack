package Sorting;

public class Bubble_Sort {
	public static void bubbleSort(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]array= {2,10,8,7};
		bubbleSort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
