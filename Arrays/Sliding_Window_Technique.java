package Arrays;

public class Sliding_Window_Technique {
	public static int maxSum(int[]array,int k)
	{
		int n=array.length;
		int current_sum=0;
		for(int i=0;i<k;i++)
		{
			current_sum+=array[i];
		}
		int max_sum=current_sum;
		for(int i=k;i<n;i++)
		{
			current_sum+=(array[i]-array[i-k]);
			max_sum=Math.max(max_sum, current_sum);
					
		}
		return max_sum;
	}
	public static void main(String[] args) {
		int[]array= {1,8,30,-5,20,7};
		System.out.println(maxSum(array, 3));
	}

}
