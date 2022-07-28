package Hashing;

import java.util.HashMap;

public class Longest_Subarray_WithGivenSum_Efficient {
	public static int maxLength(int[]array,int sum)
	{
		HashMap<Integer, Integer>m=new HashMap<Integer, Integer>();
		int pre_sum=0;
		int res=0;
		for(int i=0;i<array.length;i++)
		{
			pre_sum=pre_sum+array[i];
			if(pre_sum==sum)
			{
				res=i+1;
			}
			if(m.containsKey(pre_sum)==false)
			{
				m.put(pre_sum,i);
			}
			if(m.containsKey(pre_sum-sum))
			{
				res=Math.max(res, i-m.get(pre_sum-sum));
			}
			
		}
		return res;
		
		
	}
	public static void main(String[] args) {
		int[]array= {8,3,1,5,-6,6,2,2};//sum=4
		int[]array1= {3,1,0,1,8,2,3,6};//sum=5
		int[]array2= {5,8,-4,-4,9,-2,2};//sum=0
		System.out.println(maxLength(array2, 0));
	}

}
