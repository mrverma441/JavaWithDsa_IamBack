package Hashing;

import java.util.Arrays;

public class Longest_Consecutive_Subsequence {
	public static int longestSub(int[]array)
	{
		Arrays.sort(array);
		int res=1,curr=1;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]==array[i-1]+1)
			{
				curr++;
			}
			else if(array[i]!=array[i-1])
			{
				res=Math.max(res, curr);
				curr=1;
			}
		}
		return Math.max(res, curr);
	}
	public static void main(String[]args)
	{
		int[]array= {1,9,3,4,2,20};
		System.out.println(longestSub(array));
		
	}

}
