package recursion;

public class Factorial_Of_a_Number {

	public static int Factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		int fact=n*Factorial(n-1);
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(Factorial(6));
	}
}
