package practice;

public class Rever {
	
	public static void Rev(String str,int index)
	{
		if(index==0)
		{
			System.out.print(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
//		System.out.print(current_char);
		Rev(str, index-1);
	}
	public static void main(String[] args) {
		String str="Sachin";
		Rev(str, str.length()-1);
	}

}
