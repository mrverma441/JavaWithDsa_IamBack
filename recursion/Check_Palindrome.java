package recursion;

public class Check_Palindrome {

	static boolean isPalindrome(String str,int Start,int End)
	{
		if(Start>=End)
		{
			return true;
		}
		return (str.charAt(Start)==str.charAt(End)&&isPalindrome(str, Start+1, End-1));
	}
	public static void main(String[] args) {
		String str="abba";
		System.out.println(isPalindrome(str, 0,str.length()-1));
	}
}
