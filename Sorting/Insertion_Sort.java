package Sorting;

public class Insertion_Sort {
	public static void insertionSort(int[]array)
	{
		int n=array.length;
		for(int i=1;i<n;i++)
		{
			int key=array[i];
			int j=i-1;
			while(j>=0&&array[j]>key)
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int[]array= {20,5,40,60,10,30};
		insertionSort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
