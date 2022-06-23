package practice;

public class LeftRotate_An_ArrayByOne {

	public static void lRotate(int[]array)
	{
		int temp=array[0];
		for(int i=1;i<array.length;i++)
		{
			array[i-1]=array[i];
			
		}
		array[array.length-1]=temp;
	}
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5};
		lRotate(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
