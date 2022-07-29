package String;

import java.util.Arrays;

public class LeftMost_Repeating_Character_Efficient2 {
	static final int CHAR=256;
	public static int leftMost(String str)
	{
		int[]fIndex=new int[CHAR];
		Arrays.fill(fIndex,-1);
		int res=Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++)
		{
			int fi=fIndex[str.charAt(i)];
			//System.out.println(fi);
			if(fi==-1)
			{
				fIndex[str.charAt(i)]=i;
			}
			else
			{
				res=Math.min(res, fi);
			}
		}
		return (res==Integer.MAX_VALUE)?-1:res;
		
	}
	public static void main(String[] args) {
		String str="abccbd";
		System.out.println(leftMost(str));
		

	}

}
