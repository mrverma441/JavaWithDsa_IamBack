package Arrays;

public class Check_If_An_Array_Is_Sorted_Naive {

	public static boolean isSorted(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[i])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int array[]= {10,20,30,40};
		System.out.println(isSorted(array));
	}
}
