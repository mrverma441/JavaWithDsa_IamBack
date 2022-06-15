package practice;

public class XPowerN {

	public static int Power(int x,int n)
	{
		if(x==0)
		{
			return 0;
		}
		if(n==0)
		{
			return 1;
		}
//		return x*Power(x, n-1);
		if(n%2==0)
		{
			return Power(x, n/2)*Power(x, n/2);
		}
		else
		{
			return Power(x, n/2)*Power(x, n/2)*x;

		}
	}
	public static void main(String[] args) {
		System.out.println(Power(2, 7));
	}
}
