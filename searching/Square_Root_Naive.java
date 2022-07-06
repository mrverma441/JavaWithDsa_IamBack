package Searching;

public class Square_Root_Naive {
	public static int sqRoot(int x)
	{
		int i=1;
		while(i*i<=x)
		{
			i++;
		}
		return (i-1);
		
	}

	public static void main(String[] args) {
		System.out.println(sqRoot(15));
	}
}
