package Sorting;

public class Minimum_Difference_In_An_Array {
	public static int getMinDiff(int[]array)
	{
		int n=array.length;
		int res=Integer.MAX_VALUE;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				res=Math.min(res, Math.abs(array[i]-array[j]));
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {1,8,12,5,18};
		System.out.println(getMinDiff(array));
	}

}
