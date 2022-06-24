package Arrays;

public class Stock_Buy_And_Sell_Problem_Naive {

	public static int max_Profit(int price[],int start,int end)
	{
		if(start>=end)
		{
			return 0;
		}
		int profit=0;
		for(int i=start;i<end;i++)
		{
			for(int j=i+1;j<=end;j++)
			{
				int cur_profit=price[j]-price[i]+max_Profit(price, start, i-1)
				                                +max_Profit(price, j+1, end);
				profit=Math.max(profit, cur_profit);
				
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int []array= {1,5,3,8,12};
		System.out.println(max_Profit(array, 0, array.length-1));
	}
	
	
}
