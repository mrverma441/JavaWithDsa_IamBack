package Arrays;

public class Check_If_An_Array_Is_Sorted_Efficient {

	public static boolean isSorted(int []array)
	{
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<array[i-1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int array[]= {10,20,30,40,60};
		System.out.println(isSorted(array));

	}
}
