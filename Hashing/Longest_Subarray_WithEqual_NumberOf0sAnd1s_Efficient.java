package Hashing;

import java.util.HashMap;

public class Longest_Subarray_WithEqual_NumberOf0sAnd1s_Efficient {
	
	public static int maxLength(int[]array)
	{
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
			{
				array[i]=-1;
			}
		}
		HashMap<Integer, Integer>m=new HashMap<Integer, Integer>();
		int pre_sum=0;
		int res=0;
		for(int i=0;i<array.length;i++)
		{
			pre_sum=pre_sum+array[i];
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
		int[]array1= {1,0,1,1,1,0,0};
		int[]array2= {1,1,1,1};
		int[]array3= {0,0,1,1,1,1,1,0};
		int[]array4= {0,0,1,0,1,1};
		
		System.out.println(maxLength(array4));
	}

}
