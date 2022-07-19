package Sorting;

public class CountSort_EfficientImplementation {
	public static void countSort(int[]array,int k)
	{
		int n=array.length;
		int count[]=new int[k];
//		for(int i=0;i<k;i++)
//		{
//			count[i]=0;
//		}
		for(int i=0;i<n;i++)
		{
			count[array[i]]++;
		}
		for(int i=1;i<k;i++)
		{
			count[i]=count[i-1]+count[i];
		}
		int[]output=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			output[count[array[i]]-1]=array[i];
			count[array[i]]--;
		}
		for(int i=0;i<n;i++)
		{
			array[i]=output[i];
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
