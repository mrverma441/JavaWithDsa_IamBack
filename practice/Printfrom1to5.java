package practice;

public class Printfrom1to5 {
	public static void Print(int n)
	{
		if(n==6)
		{
			return;
		}
		//Print(n-1);
		
		System.out.println(n);
		Print(n+1);
	}
	public static void main(String[] args) {
		Print(1);
	}

}
