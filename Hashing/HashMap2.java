package Hashing;

import java.util.HashMap;

public class HashMap2 {
	public static void main(String[]args)
	{
		HashMap<String,Integer>m=new HashMap<String, Integer>();
		m.put("gfg",10);
		m.put("ide",15);
		m.put("courses",20);
		if(m.containsKey("ide"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		m.remove("ide");
		System.out.println(m.size());
		
		
	}

}
