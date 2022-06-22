package Arrays;

public class LeftRotate_An_array_BY_d_Efficient {

	public static void LeftRotate(int array[],int d)
	{
		int temp[]=new int[d];
		int n=array.length;
		for(int i=0;i<d;i++)
		{
			temp[i]=array[i];
			
		}
		for(int i=d;i<n;i++)
		{
			array[i-d]=array[i];
		}
		for(int i=0;i<d;i++)
		{
			array[n-d+i]=temp[i];
		}
		
	}
	public static void PrintArray(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int []array= {1,2,3,4,5};
		LeftRotate(array, 2);
		PrintArray(array);
	}
}
