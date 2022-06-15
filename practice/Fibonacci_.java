package practice;

public class Fibonacci_ {

	public static void Fib(int a,int b,int n)
	{
		if(n==0)
		{
			return;
		}
		int c=a+b;
		System.out.print(c);
		Fib(b, c, n-1);
	}
	public static void main(String[] args) {
		int a=0,b=1;
		int n=7;
		System.out.print(a+""+b);
		Fib(a, b, n-2);
	}
}
