package recursion;

public class Sum_Of_Digit {

	public static int getSum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return getSum(n/10)+n%10;
	}
	public static void main(String[] args) {
		System.out.println(getSum(253));
	}
}
