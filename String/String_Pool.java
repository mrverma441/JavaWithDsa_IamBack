package String;

public class String_Pool {
	public static void main(String[] args) {
		String str1="geeks";
		String str2="geeks";
		if(str1==str2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		String str3=new String("geeks");
		if(str1==str3)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
			
	}

}
