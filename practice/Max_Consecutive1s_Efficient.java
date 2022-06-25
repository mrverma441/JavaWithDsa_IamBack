package practice;

public class Max_Consecutive1s_Efficient {

	public static int maxConsecutive1s(int[]array)
	{
		int n=array.length;
		int res=0;
		int current=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==1)
			{
				current++;
				res=Math.max(current, res);
			}
			else
			{
				current=0;
		    }
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {1,0,1,1,1,1,0,0,0,1,1,1,1,1,1,0};
		System.out.println(maxConsecutive1s(array));

	}
}
