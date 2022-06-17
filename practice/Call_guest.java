package practice;

public class Call_guest {

	public static int Call_Guest(int n)
	{
		
		
		if(n<=1)
		{
			return 1;
		}
		//single
		int ways1=Call_Guest(n-1);
		
		//Pair
		int ways2=(n-1)*Call_Guest(n-2);
		return ways1+ways2;
	}
	public static void main(String[] args) {
		System.out.println(Call_Guest(4));
	}
}
