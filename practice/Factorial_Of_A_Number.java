package practice;

public class Factorial_Of_A_Number {

	public static int Calculate_Factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n*Calculate_Factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Factorial is "+Calculate_Factorial(6));
	}
}
