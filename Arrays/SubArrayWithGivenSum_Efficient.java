package Arrays;

public class SubArrayWithGivenSum_Efficient {
	public static boolean isSum(int[]array,int sum)
	{
		int n=array.length;
		int curr_sum=array[0];
		int S=0;
		for(int i=1;i<n;i++)
		{
			while(curr_sum>sum&&S<i-1)
			{
				curr_sum-=array[S];
				S++;
			}
			if(curr_sum==sum)
			{
				return true;
			}
			if(i<n)
			{
				curr_sum+=array[i];
				
			}
		}return (curr_sum==sum);
		
	}
	public static void main(String[] args) {
		int[]array= {1,4,20,3,10,5};
		System.out.println(isSum(array, 23));

	}

}
