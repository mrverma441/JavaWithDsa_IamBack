package practice;

public class Stock_Buy_And_Sell_P2E {
	
	public static int maxProfit(int[]array)
	{
		int n=array.length;
		int profit=0;
		for(int i=1;i<n;i++)
		{
			if(array[i]>array[i-1])
			{
				profit+=(array[i]-array[i-1]);
			}
		}
		return profit;
	}
	
		
	public static void main(String[] args) {
		int[]array= {1,5,3,8,12};
		System.out.println(maxProfit(array));
	}
}
