package Sorting;

public class Lomuto_Partition {
	public static int lomutoPartition(int[]array,int low,int high)
	{
		int n=array.length;
		int pivot=array[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++)
		{
			if(array[j]<pivot)
			{
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return (i+1);
		
	}
	public static void main(String[]args)
	{
		int[]array= {10,80,30,90,40,50,70};
		lomutoPartition(array, 0, 6);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
