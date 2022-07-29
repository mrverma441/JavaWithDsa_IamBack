package String;

public class String_Method4 {
	public static void main(String[] args) {
		String s1="geeksforgeeks";
		String s2="for";
		int res=s1.compareTo(s2);
		if(res==0)
		{
			System.out.println("Same");
		}
		if(res>0)
		{
			System.out.println("S1 is greater");
		}
		if(res<0)
		{

			System.out.println("S1 is smaller");
		}
		System.out.println(s1.indexOf(s2));
	}

}
