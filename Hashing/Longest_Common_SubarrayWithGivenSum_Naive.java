package Hashing;

public class Longest_Common_SubarrayWithGivenSum_Naive {
	public static int maxCommon(int[]array1,int[]array2)
	{
		int res=0;
		int n=array1.length;
		for(int i=0;i<n;i++)
		{
			int sum1=0,sum2=0;
			for(int j=i;j<n;j++)
			{
				sum1+=array1[j];
				sum2+=array2[j];
				if(sum1==sum2)
				{
					res=Math.max(res, j-i+1);
				}
			}
		}
		return res;
	}
	public static void main(String[]args)
	{
		int[]array1= {0,1,0,0,0,0};
		int[]array2= {1,0,1,0,0,1};
		System.out.println(maxCommon(array1, array2));
	}

}
