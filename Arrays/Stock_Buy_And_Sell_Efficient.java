package Arrays;

public class Stock_Buy_And_Sell_Efficient {

	public static int max_Profit(int price[])
	{
		int profit=0;
		int n=price.length;
		for(int i=1;i<n;i++)
		{
			if(price[i]>price[i-1])
			{
				profit+=(price[i]-price[i-1]);
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int array[]= {1,5,3,8,12};
		System.out.println(max_Profit(array));
	}
}
