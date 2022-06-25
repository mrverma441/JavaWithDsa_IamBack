package practice;

public class MaximumConsecutives1s {

	public static int maxConsecutive1s(int[]array)
	{
		int res=0;
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			int current=0;
			for(int j=i;j<n;j++)
			{
				if(array[j]==1)
				{
					current++;
					
				}
				else
				{
					break;
					
				}
			}
			res=Math.max(current, res);
			
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {1,0,1,1,1,1,0,0,0,1,1,1,1,1,1,0};
		System.out.println(maxConsecutive1s(array));
	}
}
