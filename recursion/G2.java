package recursion;

public class G2 {
	public static void fun1(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println("GFG");
		fun1(n-1);
	}
	public static void main(String[] args) {
		fun1(5);
	}

}
