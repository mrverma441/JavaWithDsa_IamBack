package String;

public class Naive_Pattern_Searching {
	public static void patternSearching(String txt,String pat)
	{
		int m=pat.length();
		int n=txt.length();
		for(int i=0;i<=n-m;i++)
		{
			int j;
			for(j=0;j<m;j++)
			{
				if(pat.charAt(j)!=txt.charAt(i+j))
				{
					break;
				}
			}
			if(j==m)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		String txt="ABABABCD";
		String pat="ABAB";
		patternSearching(txt, pat);
	}

}
