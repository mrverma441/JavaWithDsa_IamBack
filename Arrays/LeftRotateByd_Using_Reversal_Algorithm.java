package Arrays;

public class LeftRotateByd_Using_Reversal_Algorithm {

	public static void LeftRotate(int[]array,int d)
	{
		Reverse(array, 0, d-1);
		Reverse(array, d, array.length-1);
		Reverse(array, 0, array.length-1);
		
	}
	public static void Reverse(int[]array,int low,int high)
	{
		while(low<high)
		{
			int temp=array[low];
			array[low]=array[high];
			array[high]=temp;
			low++;
			high--;
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
