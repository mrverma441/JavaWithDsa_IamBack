package practice;

public class Fib {
	public static int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
//		int c=a+b;
//		System.out.print(" "+ c);
//		Fib(b, c, n-1);
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		
		System.out.println(fib(7));
	}

}
