package Arrays;

public class Prefix_Sum_Approach2 {
	public static int getSum(int[]array,int l,int r)
	{
		int n=array.length;
		int prefix_sum[]=new int[n];
		prefix_sum[0]=array[0];
		for(int i=1;i<n;i++)
		{
			prefix_sum[i]=prefix_sum[i-1]+array[i];
		}
		if(l!=0)
		{
			return prefix_sum[r]-prefix_sum[l-1];
		}
		else
		{
			return prefix_sum[r];
		}
	}
	
	public static void main(String[] args) {
		int[]array= {2,8,3,9,6,5,4};
//		System.out.println(getSum2(array, 0, 2));
		System.out.println(getSum(array,0,2));
		System.out.println(getSum(array,1,3));
		System.out.println(getSum(array,2,6));

	}

}
