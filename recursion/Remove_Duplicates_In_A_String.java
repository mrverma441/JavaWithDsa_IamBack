package recursion;

public class Remove_Duplicates_In_A_String {

	public  static boolean[]map=new boolean[26];
	public static void RemoveDuplicates(String str,int index,String newString)
	{
	
		if(index==str.length())
		{
			System.out.println(newString);
			return;
		}
		char current_char=str.charAt(index);
		if(map[current_char-'a']==true)
		{
			RemoveDuplicates(str, index+1, newString);
		}
		else
		{
			newString+=current_char;
			map[current_char-'a']=true;
			RemoveDuplicates(str, index+1, newString);
		}
	}
	public static void main(String[] args) {
		String str="abbccdaghiggghhhii";
		RemoveDuplicates(str, 0, "");
	}
	
}
