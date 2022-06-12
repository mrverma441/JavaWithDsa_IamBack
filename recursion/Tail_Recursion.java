package recursion;

public class Tail_Recursion {

	public static void Print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n+" ");
		Print(n-1);
	}
	public static void main(String[] args) {
		Print(6);
	}
}
