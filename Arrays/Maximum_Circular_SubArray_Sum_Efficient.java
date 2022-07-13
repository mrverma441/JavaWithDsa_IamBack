package Arrays;

public class Maximum_Circular_SubArray_Sum_Efficient {
	public static int normalMaxSum(int[]array)
	{
		int n=array.length;
		int res=array[0];
		int maxEnding=array[0];
		for(int i=1;i<n;i++)
		{
			maxEnding=Math.max(array[i], maxEnding+array[i]);
			res=Math.max(res, maxEnding);
		}
		return res;
	}
	public static int overallMaxSum(int[]array)
	{
		int n=array.length;
		int max_normal=normalMaxSum(array);
		if(max_normal<0)
		{
			return max_normal;
		}
		
		
		int array_sum=0;
		for(int i=0;i<n;i++)
		{
			array_sum+=array[i];
			array[i]=-array[i];
		}
		int max_circular=array_sum+normalMaxSum(array);
		return Math.max(max_normal, max_circular);
	}
	public static void main(String[] args) {
		int[]array= {5,-2,3,4};
		System.out.println(overallMaxSum(array));
	}

}
