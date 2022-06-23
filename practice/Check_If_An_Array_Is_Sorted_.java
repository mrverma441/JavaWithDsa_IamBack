package practice;

public class Check_If_An_Array_Is_Sorted_ {

	public static boolean isSorted(int[]array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[]array= {8,12,15,6};
		System.out.println(isSorted(array));
	}
}
