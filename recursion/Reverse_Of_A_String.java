package recursion;

public class Reverse_Of_A_String {

	public static void Rev(String str,int index)
	{
		if(index==0)
		{
			System.out.print(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		Rev(str, index-1);
		
	}
	public static void main(String[] args) {
		String str="abcd";
		Rev(str, str.length()-1);
	}
}
