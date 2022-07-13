package Arrays;

public class Prefix_Sum_Equilibrium {
	public static int pointofEquilibrium(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			int l_sum=0,r_sum=0;
			for(int j=0;j<i;j++)
			{
				l_sum+=array[j];
			}
			for(int k=i+1;k<n;k++)
			{
				r_sum+=array[k];
			}
			
			if(l_sum==r_sum)
			{
				return i;
			}
					
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[]array= {3,4,8,-9,20,6};
		System.out.println(pointofEquilibrium(array));
	}

}
