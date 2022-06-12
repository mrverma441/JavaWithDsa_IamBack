package recursion;

public class Factorial_Using_Extra_Parameter {

	
	
	public static int fact(int n,int k)
	{
		if(n==0||n==1)
		{
			return k;
		}
		return fact(n-1,k*n);
	}
	public static void main(String[] args) {
		System.out.println(fact(6,1));
	}
}
