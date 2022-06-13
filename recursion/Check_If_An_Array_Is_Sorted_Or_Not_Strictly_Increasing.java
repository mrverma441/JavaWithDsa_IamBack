package recursion;

public class Check_If_An_Array_Is_Sorted_Or_Not_Strictly_Increasing {

	public static boolean SortedArray(int[]array,int index)
	{
		if(index==array.length-1)
		{
			return true;
		}
		if(array[index]<array[index+1])
		{
			return SortedArray(array, index+1);
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5,6,};
		System.out.println(array.length);
		System.out.println(SortedArray(array, 0));
	}
}
