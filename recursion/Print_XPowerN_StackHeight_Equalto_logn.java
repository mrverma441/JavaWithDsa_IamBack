package recursion;

public class Print_XPowerN_StackHeight_Equalto_logn {

	public static int cp(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		if(n%2==0)
		{
			return cp(x,n/2)*cp(x,n/2);
		}
		else
		{
			return cp(x,n/2)*cp(x,n/2)*x;

		}
	}
	public static void main(String[] args) {
		int x=2;
		int n=5;
		System.out.println(cp(x,n));

	}

}
