package String;

public class LeftMost_NonRepeating_Element_Naive {
	public static int nonRepeat(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			boolean flag=false;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j&&str.charAt(i)==str.charAt(j))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args)
	{
		String str="geeksforgeeks";
		System.out.println(nonRepeat(str));
		
	}

}
