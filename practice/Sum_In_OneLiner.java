package practice;

public class Sum_In_OneLiner {

	public static int Print_sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+Print_sum(n-1);
		
	}
	public static void main(String[] args) {
		System.out.println("Summation is "+Print_sum(10));
	}
}
