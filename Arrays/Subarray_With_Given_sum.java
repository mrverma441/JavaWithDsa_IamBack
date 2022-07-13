package Arrays;

public class Subarray_With_Given_sum {
	public static boolean givenSum(int[]array,int sum) {
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			int total_sum=0;

			for(int j=i;j<n;j++)
			{
				total_sum+=array[j];
				if(total_sum==sum)
				{
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[]array= {1,4,20,3,10,5};
		System.out.println(givenSum(array, 33));
	}

}
