package recursion;

import java.util.HashSet;

public class UniqueSubsequencesOfString {
	public static void Subsequences(String str,int index,String newString,HashSet<String>set)
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
		char currentchar=str.charAt(index);
		// to be
		Subsequences(str,index+1,newString+currentchar,set);
		
		//or not to be
		
		Subsequences(str,index+1,newString,set);

	}


	public static void main(String[] args) {
		String str="aaa";
		HashSet<String>set=new HashSet<String>();
		
		Subsequences(str,0,"",set);


	}

}
