package practice;

public class Is_Pal {

	public static boolean isPalindrome(String str,int start,int end)
	{
		if(start>=end)
		{
			return true;
		}
		return (str.charAt(start)==str.charAt(end)&&isPalindrome(str, start+1, end-1));
	}
	public static void main(String[] args) {
		String str="abba";
		System.out.println(isPalindrome(str, 0,str.length()-1 ));
	}
}
