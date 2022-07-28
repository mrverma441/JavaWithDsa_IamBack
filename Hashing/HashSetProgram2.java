package Hashing;

import java.util.HashSet;

public class HashSetProgram2 {
	public static void main(String[]args)
	{
		HashSet<String>h=new HashSet<String>();
		h.add("gfg");
		h.add("courses");
		h.add("ide");
		System.out.println(h.size());
		
		h.remove("ide");
		System.out.println(h.size());
		for(String s:h)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println(h.isEmpty());
	}
	

}
