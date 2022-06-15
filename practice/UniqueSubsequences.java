package practice;

import org.w3c.dom.UserDataHandler;

public class UniqueSubsequences {
	public static void US(String str,int index,String newString)
	{
		if(index==str.length())
		{
			System.out.println(newString);
			return;
		}
		char current_char=str.charAt(index);
		
		//To be
		US(str, index+1, newString+current_char);
		
		//Not to be
		US(str, index+1, newString);
		
	}
	public static void main(String[] args) {
		String str="abc";
		US(str, 0,"");
	}

}
