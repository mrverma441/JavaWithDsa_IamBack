package Arrays;

public class Maximum_Consecutive1s_Efficient {
	public static int maxConsecutive1s(int[]array)
	{
		int res=0,current=0;
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				current=0;
			}
			else
			{
				current++;
				res=Math.max(res, current);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {0,1,1,0,1,0};
		System.out.println(maxConsecutive1s(array));

	}
}
