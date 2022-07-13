package Arrays;

public class P4_Largest_Contigous_Sum_Of_SubArray {

	public static int subarraySum(int[]array)
	{
		int n=array.length;
		int current_sum=0;
		int maximum_sum=0;
	
		for(int i=0;i<n;i++)
		{
			current_sum=current_sum+array[i];
			if(current_sum>maximum_sum)
			{
				maximum_sum=current_sum;
			}
			if(current_sum<0)
			{
				current_sum=0;
			}
		}
		return maximum_sum;
	}
	public static void main(String[] args) {
		//int[]array= {5,8,3};
		//int[]array= {-5,-7,-8};
		//int[]array= {2,3,-8,7,-1,2,3};
		int[]array= {1,2,3};
		System.out.println(subarraySum(array));
	}
}
