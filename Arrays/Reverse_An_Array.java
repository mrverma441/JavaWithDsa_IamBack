package Arrays;

public class Reverse_An_Array {

	public static void Reverse_An_Array(int []array)
	{
		int low=0;
		int high=array.length-1;
		System.out.println("array before reverse is ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

		System.out.println();
		while(low<high)
		{
			int temp=array[low];
			array[low]=array[high];
			array[high]=temp;
			low++;
			high--;
			
		}
		System.out.println("array after reverse is ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		Reverse_An_Array(array);
	}
}
