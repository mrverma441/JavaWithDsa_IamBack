package Arrays;

public class Left_Rotate_An_ArrayByOne {

	public static void Lrotate(int[]array)
	{
		int n=array.length;
		int temp=array[0];
		for(int i=1;i<n;i++)
		{
			array[i-1]=array[i];
		}
		array[n-1]=temp;
	}
	public static void PrintArray(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		//int array[]= {1,2,3,4,5};
		int[] array= {30,5,20};
		Lrotate(array);
		PrintArray(array);
	}
}
