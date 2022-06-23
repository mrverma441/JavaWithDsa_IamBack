package practice;

public class Maximum_Difference {
	public static int MaxDiff(int[]array)
	{
		int n=array.length;
		int res=array[1]-array[0];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				res=Math.max(res, array[j]-array[i]);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {2,3,10,6,4,8,1};
		System.out.println(MaxDiff(array));
	}

}
