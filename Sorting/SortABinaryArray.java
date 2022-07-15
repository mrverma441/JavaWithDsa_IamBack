package Sorting;

public class SortABinaryArray {
	public static void segregateEvenOdd(int[]array)
	{
		int n=array.length;
		int i=-1;
		int j=n;
		while(true)
		{
			do
			{
				i++;
			}while(array[i]==0);
			do
			{
				j--;
			}while(array[j]==1);
			if(i>=j)
				return;
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
	}
	public static void main(String[] args) {
		int[]array= {0,1,1,1,0};
		segregateEvenOdd(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
