package Arrays;

public class Remove_Duplicate_From_A_Sorted_array {

	public static int RemDup(int array[])
	{
		int res=1;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]!=array[res-1])
			{
				array[res]=array[i];
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int array[]= {10,20,20,30,30,30,30};
		System.out.println(RemDup(array));
	}
}
