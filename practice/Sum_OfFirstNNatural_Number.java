package practice;

public class Sum_OfFirstNNatural_Number {

	public static void Print_Sum(int i,int sum,int n)
	{
		if(i>n)
		{
		
			System.out.println(sum);
			return;
		}
		sum=sum+i;
		Print_Sum(i+1, sum, n);
	}
	public static void main(String[] args) {
		Print_Sum(1, 0, 10);
	}
}
