package Arrays;

public class P7_Equilibrium_Point {
	public static int Equilibrium_Point(int[]array)
	{
		int n=array.length;
		int total_sum=0,current_sum=0;
		for(int i=0;i<n;i++)
		{
			total_sum+=array[i];
		}
		for(int j=0;j<n;j++)
		{
			total_sum=total_sum-array[j];
			if(total_sum==current_sum)
			{
				return j;
			}
			else
			{
				current_sum=current_sum+array[j];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {1,3,5,2,2};
		int[]array2= {4,2,-2};
		System.out.println(Equilibrium_Point(array2));
	}

}
