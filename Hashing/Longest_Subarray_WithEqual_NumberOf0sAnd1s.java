package Hashing;

public class Longest_Subarray_WithEqual_NumberOf0sAnd1s {
	public static int longestSubarray(int[]array)
	{
		int n=array.length;
		int res=0;
		for(int i=0;i<n;i++)
		{
			int count0=0,count1=0;
			for(int j=i;j<n;j++)
			{
				if(array[j]==0)
				{
					count0++;
				}
				else
				{
					count1++;
				}
				if(count0==count1)
				{
					res=Math.max(res, count0+count1);
				}
				
			}
		}
		return res;
	}
	public static void main(String[]args)
	{
		int[]array1= {1,0,1,1,1,0,0};
		int[]array2= {1,1,1,1};
		int[]array3= {0,0,1,1,1,1,1,0};
		int[]array4= {0,0,1,0,1,1};
		System.out.println(longestSubarray(array4));
	}

}
