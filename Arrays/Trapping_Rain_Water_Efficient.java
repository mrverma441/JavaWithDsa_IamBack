package Arrays;

public class Trapping_Rain_Water_Efficient {

	public static int getWater(int[]array)
	{
		int res=0;
		int n=array.length;
		int lmax[]=new int[n];
		int rmax[]=new int[n];
		lmax[0]=array[0];
		for(int i=1;i<n;i++)
		{
			lmax[i]=Math.max(array[i],lmax[i-1]);
			
		}
		rmax[n-1]=array[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rmax[i]=Math.max(array[i],rmax[i+1]);
		}
		for(int i=1;i<n-1;i++)
		{
			res=res+(Math.min(lmax[i],rmax[i])-array[i]);
		}
		return res;
		
		
	}
	public static void main(String[] args) {
		int[]array= {3,0,1,2,5};
		System.out.println(getWater(array));

	}
}
