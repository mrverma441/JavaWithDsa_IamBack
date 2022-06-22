package recursion;

public class Print_XPowerN_StackHeight_Equalto_n {

	public static int CP(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		
		return x*CP(x,n-1);
	}
	public static void main(String[] args) {
		int x=2;
		int n=5;
		System.out.println(CP(x,n));
	}
}
