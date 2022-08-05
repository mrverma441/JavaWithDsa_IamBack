package String;

public class Annagram_Search {
	static final int CHAR=256;
	public static boolean areAnnagram(String txt,String pat,int i)
	{
		int[]count=new int[CHAR];
		for(int j=0;j<pat.length();j++)
		{
			count[pat.charAt(j)]++;
			count[txt.charAt(i+j)]--;
		}
		for(int j=0;j<CHAR;j++)
		{
			if(count[j]!=0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPresent(String txt,String pat)
	{
		int n=txt.length();
		int m=pat.length();
		for(int i=0;i<=n-m;i++)
		{
			if(areAnnagram(txt,pat,i))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String txt="geeksforgeeks";
		String pat="frog";
		System.out.println(isPresent(txt, pat));
	}

}
