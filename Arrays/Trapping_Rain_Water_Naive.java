package Arrays;
//Time complexity is O(n2) for this solution
public class Trapping_Rain_Water_Naive {

	public static int getWater(int[]array)
	{
		int res=0;
		int n=array.length;
		for(int i=1;i<n-1;i++)
		{
			int lmax=array[i];//for finding lmax
			for(int j=0;j<i;j++)
			{
				lmax=Math.max(lmax, array[j]);
				
			}
			int rmax=array[i];//for finding rmax
			for(int j=i+1;j<n;j++)
			{
				rmax=Math.max(rmax, array[j]);
				
			}
			res=res+(Math.min(lmax, rmax)-array[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		//int array[]= {2,0,2};
		int[]array= {3,0,1,2,5};
		System.out.println(getWater(array));
	}
}
