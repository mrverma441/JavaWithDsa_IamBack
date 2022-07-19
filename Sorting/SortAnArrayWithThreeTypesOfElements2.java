package Sorting;

public class SortAnArrayWithThreeTypesOfElements2 {
	public static void sortPivot(int[]array,int pivot)
	{
		
		int n=array.length;
		int index=0;
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(array[i]<pivot)
			{
				temp[index]=array[i];
				index++;
			}
		}
		for(int i=0;i<n;i++)
		{
		 
			if(array[i]==pivot)
			{
				temp[index]=array[i];
				index++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]>pivot)
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
		int[]array= {2,1,2,20,10,20,1};
		sortPivot(array, 2);
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}
		
	}

}
