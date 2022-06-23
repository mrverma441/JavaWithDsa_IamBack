package practice;

public class LeftRotateAnArrayByD {

	public static void LeftRotate(int[]array)
	{
		int temp=array[0];
		for(int i=1;i<array.length;i++)
		{
			array[i-1]=array[i];
		}
		array[array.length-1]=temp;
		
	}
	public static void LeftRotatebyd(int[]array,int d)
	{
		for(int i=0;i<d;i++)
		{
			LeftRotate(array);
		}
	}
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5};
		int d=2;
		LeftRotatebyd(array, d);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
