package Arrays;

public class LeftRotateAn_Array_By_d {

	public static void LeftRotateByone(int array[])
	{
		int n=array.length;
		int temp=array[0];
		for(int i=1;i<n;i++)
		{
			
			array[i-1]=array[i];
		}
		array[n-1]=temp;
	}
	public static void LeftRotate(int[]array,int d)
	{
		for(int i=0;i<d;i++)
		{
			LeftRotateByone(array);
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
		int array[]= {1,2,3,4,5};
		int d=2;
		LeftRotate(array,d);
		PrintArray(array);
		
	}
}
