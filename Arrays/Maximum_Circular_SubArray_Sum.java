package Arrays;

public class Maximum_Circular_SubArray_Sum {
	public static int max_CircularSum(int[]array)
	{
		int res=array[0];
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			int curr_max=array[i];
			int curr_sum=array[i];
			for(int j=1;j<n;j++)
			{
				int index=(i+j)%n;
				curr_sum+=array[index];
				curr_max=Math.max(curr_max, curr_sum);
			}
			res=Math.max(res, curr_max);
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {5,-2,3,4};
		System.out.println(max_CircularSum(array));
	}

}
