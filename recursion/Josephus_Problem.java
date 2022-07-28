package recursion;

public class Josephus_Problem {

	public static int Jos(int n,int k)
	{
		if(n==1)
		{
			return 0;
		}
		else
		{
			return ((Jos(n-1,k)+k)%n);
		}
	}
	public static void main(String[] args) {
		System.out.println(Jos(5, 3));
	}
}
