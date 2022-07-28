package Hashing;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Unsorted_Arrays_Efficient {
	public static int intersection(int[]a,int b[])
	{
		Set<Integer>s=new HashSet<Integer>();
		int res=0;
		
		for(int x:a)
		{
			s.add(x);
		}
		for(int x:b)
		{
			if(s.contains(x))
			{
				res++;
				s.remove(x);
				
			}
		}
		return res;
	}
	public static void main(String[]args)
	{
		int[]a= {10,10,30,20};
		int[]b= {20,10,40,10,40,30};

		System.out.println(intersection(a, b));
	}

}
