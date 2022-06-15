package practice;

public class RemoveAllDuplicatesInaString {

	public static boolean[]map=new boolean[26];
	public static void RemD(String str,int index,String newString)
	{
		if(index==str.length())
		{
			System.out.println(newString);
			return;
		}
		char current_char=str.charAt(index);
		if(map[current_char-'a']==true)
		{
			RemD(str, index+1, newString);
		}
		else
		{
			newString+=current_char;
			map[current_char-'a']=true;
			RemD(str, index+1, newString);
		}
	}
	public static void main(String[] args) {
		String str="abbccda";
		RemD(str, 0, "");
	}
}
