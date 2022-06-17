package practice;

public class PrintAllPermutation {

	public static void Print(String str,String permutation)
	{
		if(str.length()==0)
		{
			System.out.println(permutation);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char current_char=str.charAt(i);
			String newString=str.substring(0,i)+str.substring(i+1);
			Print(newString, permutation+current_char);
		}
	}
	public static void main(String[] args) {
		String str="ABC";
		Print(str, "");
	}
	
}
