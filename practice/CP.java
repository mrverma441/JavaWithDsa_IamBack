package practice;

public class CP {
	public static int CP(int x,int n)
	
	{
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		return x*CP(x,n-1);
	}
	public static void main(String[] args) {
		System.out.println(CP(2, 5));
	}

}
