package Sorting;

public class HoarePartition {
	public static int HoaresPartition(int[]array,int low,int high)
	{
		int n=array.length;
		int pivot=array[low];
		int i=low-1;
		int j=high+1;
		while(true)
		{
			do
			{
				i++;
			}while(array[i]<pivot);
			do
			{
				j--;
			}while(array[j]>pivot);
			if(i>=j)
			{
				return j;
			}
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		
	}
	public static void main(String[]args)
	{
		int[]array= {5,3,8,4,2,7,1,10};
		int result=HoaresPartition(array, 0, 7);
		System.out.println(result);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}
	

}
