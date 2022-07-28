package Hashing;

public class Pair_With_GivenSum_In_Unsorted_Array {
	public static boolean isPair(int[]array,int sum)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]+array[j]==sum)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[]args)
	{
		int[]array= {3,2,8,15,-8};
		System.out.println(isPair(array, 17));
	}

}
