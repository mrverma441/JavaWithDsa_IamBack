package practice;

public class Stack_Height_Logn {

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
		if(n%2==0)
		{
			return CP(x,n/2)*CP(x,n/2);
		}
		else
		{
			return CP(x,n/2)*CP(x,n/2)*x;
		}
	}
	public static void main(String[] args) {
		System.out.println(CP(2,7));
	}
}
