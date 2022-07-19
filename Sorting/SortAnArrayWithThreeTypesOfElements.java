package Sorting;

public class SortAnArrayWithThreeTypesOfElements {
	public static void sort012(int[]array)
	{
		int n=array.length;
		int temp[]=new int[n];
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				temp[index]=array[i];
				index++;

			}
					
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]==1)
			{
				temp[index]=array[i];
				index++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]==2)
			{
				if(array[i]==2)
				{
					temp[index]=array[i];
					index++;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			array[i]=temp[i];
		}
	
	}
	public static void main(String[]args)
	{
		int[]array= {0,1,0,2,1,2};
		sort012(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
