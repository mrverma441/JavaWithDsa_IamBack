package Arrays;

public class Prefix_Sum {
	public static int getSum(int[]array,int l,int r)
	{
		int sum=0;
		for(int i=l;i<=r;i++)
		{
			sum+=array[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int[]array= {2,8,3,9,6,5,4};
		System.out.println(getSum(array, 2, 6));
	}

}
