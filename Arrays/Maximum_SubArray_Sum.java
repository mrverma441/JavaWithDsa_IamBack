package Arrays;

public class Maximum_SubArray_Sum {

	public static int MaxSum(int[]array)
	{
		int n=array.length;
		int res=array[0];
		for(int i=0;i<n;i++)
		{
			int current=0;
			for(int j=i;j<n;j++)
			{
				current=current+array[j];
				res=Math.max(res, current);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {2,3,-8,7,-1,2,3};
		System.out.println(MaxSum(array));
	}
}
