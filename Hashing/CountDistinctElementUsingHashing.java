package Hashing;

import java.util.HashSet;

public class CountDistinctElementUsingHashing {
	public static int countDistinct(int[]array)
	{
		HashSet<Integer>s=new HashSet<Integer>();
		for(int i=0;i<array.length;i++)
		{
			s.add(array[i]);
		}
		return s.size();
	}
	public static void main(String[] args) {
		int[]array= {15,12,13,12,13,13,18};
		System.out.println(countDistinct(array));
	}

}
