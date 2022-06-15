package practice;

public class FirstAndLastOccurence {

	public static int first=-1;
	public static int last=-1;
	public static void Occurence(String str,int index,char element)
	{
		if(index==str.length())
		{
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char current_char=str.charAt(index);
		if(current_char==element)
		{
			if(first==-1)
			{
				first=index;
			}
			else
			{
				last=index;
			}
		}
		Occurence(str, index+1, element);

	}
	public static void main(String[] args) {
		String str="abaacdaefaah";
		Occurence(str,0,'a');
		
	}
}
