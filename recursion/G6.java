package recursion;

public class G6 {
	public static int fun(int n)
	{
		if(n<3)
		{
			return 0;
		}
		else
		{
			return 1+fun(n/3);
		}
	}
	public static void main(String[] args) {
		System.out.println(fun(48));
	}

}
