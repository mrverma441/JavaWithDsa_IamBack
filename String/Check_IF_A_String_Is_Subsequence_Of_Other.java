package String;

public class Check_IF_A_String_Is_Subsequence_Of_Other {
	public static boolean isSubseq(String s1,String s2)
	{
		int n=s1.length();
		int m=s2.length();
		if(n<m)
		{
			return false;
		}
		int j=0;
		for(int i=0;i<n&&j<m;i++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				
				j++;
			}
		}
		return (j==m);
	}
	public static void main(String[] args) {
		String s1="ABCD";
		String s2="AD";
		System.out.println(isSubseq(s1, s2));
	}

}
