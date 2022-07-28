package Hashing;

import java.util.HashSet;

public class SubarrayWithGivenSum_Efficient {
	public static boolean subarraySum(int[]array,int sum)
	{
		HashSet<Integer>h=new HashSet<Integer>();
		int pref_sum=0;
		for(int i=0;i<array.length;i++)
		{
			pref_sum+=array[i];
			if(h.contains(pref_sum-sum))
			{
				return true;
			}
			if(pref_sum==sum)
			{
				return true;
			}
			h.add(pref_sum);
		}
		return false;
	}
	public static void main(String[]args)
	{
		int[]array= {5,8,6,13,3,-1};
		System.out.println(subarraySum(array, 22));
		
	}

}
