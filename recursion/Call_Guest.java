package recursion;

public class Call_Guest {

	public static int Call_guest(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		
		//Single 
		int ways1=Call_guest(n-1);
		
		//Pair
		int ways2=(n-1)*Call_guest(n-2);
		
		return ways1+ways2;
	}
	public static void main(String[] args) {
		System.out.println(Call_guest(4));
	}
}
