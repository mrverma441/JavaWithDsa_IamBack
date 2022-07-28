package Hashing;

import java.util.HashSet;

public class SubArrayWith0Sum_Efficient {
	public static boolean is0Subarray(int[]array)
	{
		HashSet<Integer>h=new HashSet<Integer>();
		int pref_sum=0;
		for(int i=0;i<array.length;i++)
		{
			pref_sum+=array[i];
			if(h.contains(pref_sum))
			{
				return true;
			}
			if(pref_sum==0)
			{
				return true;
			}
			h.add(pref_sum);
		}
		return false;
	}
	public static void main(String[] args) {
		int[]array= {1,4,13,-3,-10,5};
		System.out.println(is0Subarray(array));
	}

}
