package practice;

public class Stock_Buy_And_Sell_Problem {

	public static int maxProfit(int[]price,int start,int end)
	{
		int n=price.length;
		if(start>=end)
		{
			return 0;
		}
		int profit=0;
		for(int i=start;i<end;i++)
		{
			for(int j=i+1;j<=end;j++)
				
			{
				int current_profit=price[j]-price[i]+maxProfit(price, start, i-1)+maxProfit(price, j+1, end);
				profit=Math.max(profit, current_profit);
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int[]array= {1,5,3,8,12};
		System.out.println(maxProfit(array, 0, array.length-1));
	}
}
