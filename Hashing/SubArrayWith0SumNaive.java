package Hashing;

public class SubArrayWith0SumNaive {
	public static boolean is0Subarray(int[]array)
	{
		for(int i=0;i<array.length;i++)
		{
			int current_sum=0;
			for(int j=i;j<array.length;j++)
			{
				current_sum+=array[j];
				if(current_sum==0)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[]args)
	{
		int[]array= {1,4,13,-3,-10,5};
		System.out.println(is0Subarray(array));
	}

}
