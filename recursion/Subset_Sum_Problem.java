package recursion;

public class Subset_Sum_Problem {

	public static int CountSubsets(int array[],int n,int sum)
	{
		if(n==0)
		{
			return(sum==0)?1:0;
		}
		return CountSubsets(array, n-1, sum)+CountSubsets(array, n-1, sum-array[n-1]);
	}
	public static void main(String[] args) {
		int array[]= {1,2,3};
		int sum=4;
		System.out.println(CountSubsets(array, array.length, sum));
	}
}
