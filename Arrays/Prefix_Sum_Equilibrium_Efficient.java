package Arrays;

public class Prefix_Sum_Equilibrium_Efficient { 
	public static int isEqPoint(int[]array)
	{
		int n=array.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=array[i];
		}
		int l_sum=0;
		for(int i=0;i<n;i++)
		{
			if(l_sum==sum-array[i])
			{
				return i;
			}
			l_sum=l_sum+array[i];
			sum=sum-array[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {3,4,8,-9,20,6};
		System.out.println(isEqPoint(array));
	}

}
