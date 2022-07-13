package Sorting;

public class Bubble_Sort_Efficient {
	public static void bubbleSort(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			boolean swapped=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
			if(swapped==false)
			{
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		int[]array= {3,5,10,20,40};
		bubbleSort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
