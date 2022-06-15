package practice;

public class MoveAllX {
	public static void Move(String str,int index,int count,String newString)
	{
		if(index==str.length())
		{
			for(int i=0;i<count;i++)
			{
				newString+='x';
				
			}
			System.out.println(newString);
			return;
		}
		char current_char=str.charAt(index);
		if(current_char=='x')
		{
			count++;
			Move(str, index+1, count, newString);
		}
		else
		{
			newString+=current_char;
			Move(str, index+1, count, newString);
			
		}
	}
	public static void main(String[] args) {
		String str="axbcxxd";
		Move(str, 0, 0, "");
	}

}
