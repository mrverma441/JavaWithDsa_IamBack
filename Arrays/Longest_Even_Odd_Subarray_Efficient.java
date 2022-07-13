package Arrays;

public class Longest_Even_Odd_Subarray_Efficient {
	public static int maxEvenOdd(int[]array)
	{
		int res=1;
		int curr=1;
		int n=array.length;
		for(int i=1;i<n;i++)
		{
			if((array[i]%2==0&&array[i-1]%2!=0)||(array[i]%2!=0&&array[i-1]%2==0))
			{
				curr++;
				res=Math.max(res, curr);
				
			}
			else
			{
				curr=1;
			}
	
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {10,12,14,7,8};
		int[]array1= {7,10,13,14};
		System.out.println(maxEvenOdd(array1));
	}

}

