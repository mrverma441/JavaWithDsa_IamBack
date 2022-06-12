package recursion;

public class KeyPadCombination {
	public static String[]keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void PrintCombination(String str,int index,String Combination)
	{
		if(index==str.length())
		{
			System.out.println(Combination);
			return;
			
		}
		char currentchar=str.charAt(index);
		String mapping=keypad[currentchar -'0'];
		for(int i=0;i<mapping.length();i++)
		{
			PrintCombination(str,index+1,Combination+mapping.charAt(i));
		}
	}
	
	public static void main(String[]args)
	{
		String str="23";
		PrintCombination(str,0,"");
		
	}

}
