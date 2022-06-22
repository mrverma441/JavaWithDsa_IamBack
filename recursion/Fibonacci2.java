package recursion;

public class Fibonacci2 {

	public static void fibonacci(int a,int b,int n)
	{
		if(n==0)
		{
			return;
		}
		int c=a+b;
		System.out.print(c+" ");
		fibonacci(b,c,n-1);
		
	}
	public static void main(String[] args) {
		int a=0,b=1;
		int n=7;
		System.out.print(a+" "+b+" ");
		fibonacci(a,b,n-2);

		
		
	}

}
