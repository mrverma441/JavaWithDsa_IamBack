package recursion;

public class Subsequences_Of_A_String {

	public static void Subsequences(String str,int index,String newString)
	{
	
		if(index==str.length())
		{
			System.out.println(newString);
			return;
		}
		char current_char=str.charAt(index);
		
		//to be 
		Subsequences(str, index+1, newString+current_char);
		
		// not to be 
		
		Subsequences(str, index+1, newString);
	}
	public static void main(String[] args) {
		String str="abc";
		Subsequences(str, 0, "");
	}
}
