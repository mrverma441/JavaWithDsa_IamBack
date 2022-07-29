package String;

public class Check_Palindrome_Naive {
	public static boolean isPal(String str)
	{
		StringBuilder rev=new StringBuilder(str).reverse();
		return str.equals(rev.toString());
	}
	public static void main(String[] args) {
		String str="ABCDCBA";
		System.out.println(isPal(str));
	}
}
