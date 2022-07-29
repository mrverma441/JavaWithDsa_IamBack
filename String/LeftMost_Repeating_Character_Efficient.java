package String;

public class LeftMost_Repeating_Character_Efficient {
	static final int CHAR=256;
	
	public static int leftMost(String str)
	{
		int[]count=new int[CHAR];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(count[str.charAt(i)]>1)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args)
	{
		String str="geeksforgeeks";
		System.out.println(leftMost(str));
		
	}

}
