package Hashing;

import java.util.HashSet;

public class Pair_With_GivenSum_In_Unsorted_Array_Efficient {
	public static boolean isPair(int[]array,int sum)
	{
		int n=array.length;
		HashSet<Integer>h=new HashSet<Integer>();
		for(int x:array)
		{
			if(h.contains(sum-x))
			{
				return true;
			}
			else
			{
				h.add(x);
			}
		}
		return false;
	}
	public static void main(String[]args)
	{
		int[]array= {3,2,8,15,-8};
		System.out.println(isPair(array, 5));
	}

}
