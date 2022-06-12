package recursion;

public class Sum_Of_Natural_Number {

	public static int getSum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+getSum(n-1);
	}
	public static void main(String[] args) {
		System.out.println(getSum(10));
	}
}
