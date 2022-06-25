package Arrays;

public class Maximum_SubArray_Sum_Efficient {

	public static int maxSum(int[]array)
	{
		int n=array.length;
		int res=array[0];
		int maxEnding=array[0];
		for(int i=1;i<n;i++)
		{
			maxEnding=Math.max(maxEnding+array[i], array[i]);
			res=Math.max(res, maxEnding);
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {2,3,-8,7,-1,2,3};
		System.out.println(maxSum(array));
	}
}
