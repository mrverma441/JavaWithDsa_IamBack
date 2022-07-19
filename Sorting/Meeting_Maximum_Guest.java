package Sorting;

import java.util.Arrays;

public class Meeting_Maximum_Guest {
	public static int maxGuest(int[]array,int dep[])
	{
		int n=array.length;
		Arrays.sort(array);
		Arrays.sort(dep);
		int i=1;int j=0;int res=1,current=1;
		while(i<n&&j<n)
		{
			if(array[i]<=dep[j])
			{
				current++;
				i++;
			}
			else
			{
				current--;
				j++;
			}
			res=Math.max(res, current);
		}
		return res;
	}
	public static void main(String[]args)
	{
		int[]array= {900,600,700};
		int[]Departure= {1000,800,730};
		System.out.println(maxGuest(array, Departure));
		
	}

}
