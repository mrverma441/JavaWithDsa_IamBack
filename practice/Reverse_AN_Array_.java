package practice;

public class Reverse_AN_Array_ {
	public static void reverse(int[]array)
	{
		int n=array.length;
		int low=0;
		int high=n-1;
		while(low<high)
		{
			int temp=array[low];
			array[low]=array[high];
			array[high]=temp;
			low++;high--;
		}
		
	}
	public static void main(String[] args) {
		int[]array= {10,20,30,40,50};
	
		reverse(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
