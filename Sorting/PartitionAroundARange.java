package Sorting;

public class PartitionAroundARange {
	public static void sort(int[]array,int RS,int RE)
	{
		int n=array.length;
		int temp[]=new int[n];
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]<RS)
			{
				temp[index]=array[i];
				index++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]==RS)
			{
				temp[index]=array[i];
				index++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]>RS&&array[i]<RE)
			{
				temp[index]=array[i];
				index++;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(array[i]==RE)
			{
				temp[index]=array[i];
				index++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]>RE)
			{
				temp[index]=array[i];
				index++;
			}
		}
		for(int i=0;i<n;i++)
		{
			array[i]=temp[i];
		}
	}
	public static void main(String[]args)
	{
		int[]array= {10,5,6,3,20,9,40};
		int RS=5;
		int RE=10;
		sort(array, RS, RE);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
