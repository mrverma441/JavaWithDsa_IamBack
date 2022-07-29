package String;

public class Check_If_A_String_Is_Subsequence_Of_Other_Efficient {
	public static boolean isSubsequenceRec(String s1,String s2,int n,int m)
	{
		if(m==0)
		{
			return true;
		}
		if(n==0)
		{
			return false;
		}
		if(s1.charAt(n-1)==s2.charAt(m-1))
		{
			return isSubsequenceRec(s1, s2, n-1, m-1);
		}
		else
		{
			return isSubsequenceRec(s1, s2, n-1, m);
		}
	}
	public static void main(String[] args) {
		String s1="ABCD";
		String s2="AD";
		int n=s1.length();
		int m=s2.length();
		System.out.println(isSubsequenceRec(s1, s2, n, m));
	}

}
