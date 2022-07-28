package Hashing;

import java.util.HashSet;

public class Union_Of_Two_Unsorted_Array_Naive {
	public static int countUnion(int[]a,int[]b)
	{
		HashSet<Integer>h=new HashSet<Integer>();
		int res=0;
		for(int x:a)
		{
			if(h.contains(x))
			{
				
			}
			else
			{
				res++;
				h.add(x);
				
			}
		}
		for(int x:b)
		{
			if(h.contains(x))
			{
				
			}
			else
			{
				res++;
				h.add(x);
				
			}
		}
		return h.size();
	}
	public static void main(String[] args) {
		int[]a= {15,20,5,15,13,14};
		int b[]= {15,15,15,20,10};
		System.out.println(countUnion(a, b));

	}

}
