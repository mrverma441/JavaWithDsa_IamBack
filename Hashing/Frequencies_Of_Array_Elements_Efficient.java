package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequencies_Of_Array_Elements_Efficient {
	public static void countFrequency(int[]array)
	{
		HashMap<Integer,Integer>h=new HashMap<Integer, Integer>();
		for(int x:array)
		{
			h.put(x, h.getOrDefault(x,0)+1);
			
		}
		for(Map.Entry<Integer,Integer>e:h.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
	public static void main(String[] args) {
		int[]array= {10,12,10,15,10,20,12,12};
		countFrequency(array);
	}

}
