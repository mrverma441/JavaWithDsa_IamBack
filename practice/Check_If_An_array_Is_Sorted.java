package practice;

public class Check_If_An_array_Is_Sorted {

	public static boolean Sorted_Array(int[]array,int index)
	{
		if(index==array.length-1)
		{
			return true;
		}
		if(array[index]<array[index+1])
		{
			return Sorted_Array(array, index+1);
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5,6,7,8,9};
		System.out.println(Sorted_Array(array, 0));
	}
}
