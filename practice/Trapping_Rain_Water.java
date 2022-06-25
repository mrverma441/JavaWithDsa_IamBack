package practice;

public class Trapping_Rain_Water {
	
	public static int getWater(int[]array)
	{
		int n=array.length;
		int res=0;
		for(int i=1;i<n-1;i++)
		{
			int lmax=array[i];
			for(int j=0;j<i;j++)
			{
				lmax=Math.max(lmax, array[j]);
			}
			int rmax=array[i];
			for(int j=i+1;j<n;j++)
			{
				rmax=Math.max(rmax, array[j]);
			}
			res+=(Math.min(lmax, rmax)-array[i]);
		}
		return res;
		
	}

	
	public static void main(String[] args) {
		int[]array= {2,0,2};
		System.out.println(getWater(array));
	}
	
}
