package recursion;

public class G3 {

	public static void fun(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		fun(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		fun(5);
	}
}
