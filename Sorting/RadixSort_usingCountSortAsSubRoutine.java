package Sorting;

public class RadixSort_usingCountSortAsSubRoutine {
	public static void countingSort(int[]array,int exp)
	{
		int n=array.length;
		int count[]=new int[10];
		int output[]=new int[10];
		for(int i=0;i<10;i++)
		{
			count[i]=0;
			
		}
		for(int i=0;i<n;i++)
		{
			count[(array[i]/exp)%10]++;
		}
		for(int i=1;i<10;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		for(int i=n-1;i>=0;i--)
		{
			output[count[(array[i]/exp)%10]-1]=array[i];
			count[(array[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++)
		{
			array[i]=output[i];
		}
	}
	public static void radixSort(int[]array)
	{
		int n=array.length;
		int max=array[0];
		for(int i=0;i<n;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		for(int exp=1;max/exp>0;exp=exp*10)
		{
			countingSort(array, exp);
		}
	}
	public static void main(String[]args)
	{
		int[]array= {319,212,6,8,100,50};
		radixSort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
