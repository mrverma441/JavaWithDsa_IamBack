package Arrays;

public class Window_Sliding_Technique {
	public static int WST(int[]array,int k)
	{
		int n=array.length;
		int sum = 0;
		int res=0;
		int res2 = 0;
		for(int i=0;i<n-k+1;i++)
		{
		
			sum=0;
			for(int j=i;j<i+k;j++)
			{
				
				sum+=array[j];
				res=sum;
				res2=Math.max(res, res2);
			}
		}
		return res2;
	}
	public static void main(String[] args) {
		//int[]array= {1,8,30,-5,20,7};
		int[]array= {5,-10,6,90,3};
		System.out.println(WST(array, 2));
	}

}
