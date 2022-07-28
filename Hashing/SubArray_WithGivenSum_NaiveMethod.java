package Hashing;

public class SubArray_WithGivenSum_NaiveMethod {
	public static boolean isSubarraySum(int[]array,int sum)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			int current_sum=0;
			for(int j=i;j<n;j++)
			{
				current_sum+=current_sum+array[j];
				if(current_sum==sum)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String []args)
	{
		int[]array= {5,8,6,13,3,-1};
		System.out.println(isSubarraySum(array, 22));
	}

}
