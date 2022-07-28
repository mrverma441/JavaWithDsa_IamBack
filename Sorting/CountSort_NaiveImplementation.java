package Sorting;

public class CountSort_NaiveImplementation {
	public static void countSort(int[]array,int k)
	{
		int n=array.length;
		int count[]=new int[n];
		for(int i=0;i<k;i++)
		{
			count[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			count[array[i]]++;
		}
		int index=0;
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<count[i];j++)
			{
				array[index]=i;
				index++;
			}
		}
	}
	public static void main(String[]args)
	{
		int[]array= {1,4,4,1,0,1};
		int k=5;
		countSort(array, k);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

			
			
			
	}
	

}
