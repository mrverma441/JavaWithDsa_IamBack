package Hashing;

import java.util.HashMap;

public class Longest_CommonSubarray_WithGivenSum {
	public static int longestCommonSubarray(int[]array1,int[]array2)
	{
		int n=array1.length;
		int []temp=new int[n];
		for(int i=0;i<n;i++)
		{
			temp[i]=array1[i]-array2[i];
		}
		HashMap<Integer, Integer>m=new HashMap<Integer, Integer>();
		int pre_sum=0;
		int res=0;
		for(int i=0;i<temp.length;i++)
		{
			pre_sum=pre_sum+temp[i];
			if(pre_sum==0)
			{
				res=i+1;
			}
		
			if(m.containsKey(pre_sum))
			{
				res=Math.max(res, i-m.get(pre_sum));
			}
			else
			{
				m.put(pre_sum,i);

			}
			
		}
		return res;
		
		
	}

	
	public static void main(String[] args) {
		int[]array1= {0,1,0,0,0,0};
		int[]array2= {1,0,1,0,0,1};
		int[]array3= {0,1,0,1,1,1,1};
		int[]array4= {1,1,1,1,1,0,1};
		
		System.out.println(longestCommonSubarray(array3, array4));
	}

}
