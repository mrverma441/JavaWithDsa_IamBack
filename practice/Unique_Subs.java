package practice;

import java.util.HashSet;

public class Unique_Subs {
	public static void Sub(String str,int index,String newString,HashSet<String>set)
	{
		
		
		if(index==str.length())
		{
			if(set.contains(newString))
			{
				return;
			}
			else
			{
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		char current_char=str.charAt(index);
		
		
		
		//To be
		Sub(str, index+1, newString+current_char, set);
		
		
		//not to be 
		Sub(str, index+1, newString, set);
	}
	public static void main(String[] args) {
		String str="aaa";
		HashSet<String>set=new HashSet<String>();
		
		Sub(str, 0,"", set);
	}

}
