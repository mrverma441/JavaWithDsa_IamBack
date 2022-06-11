
package recursion;

public class Find_First_And_Last_Occurence_In_A_Given_String {

	public static int first=-1;
	public static int last=-1;
	public static void Occurence(String str,int index,char element)
	{
		if(index==str.length())
		{
			System.out.println("First occurence is found at index "+first);
			System.out.println("Last occurence is found at index "+last);
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
