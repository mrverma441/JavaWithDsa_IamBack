package recursion;

public class Not_Tail_Recursion {

	public static void Print(int n)
	{
		if(n==0)
		{
			return;
		}
		Print(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		Print(6);
	}
}
