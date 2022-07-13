package Arrays;

public class Longest_Even_Odd_SubArray {
	public static int maxEvenOdd(int[]array)
	{
		int n=array.length;
		int res=1;
		for(int i=0;i<n;i++)
		{
			int curr=1;
			for(int j=i+1;j<n;j++)
			{
				if((array[j]%2==0&&array[j-1]%2!=0)||(array[j]%2!=0&&array[j-1]%2==0))
				{
					curr++;
				}
				else
				{
					break;
				}
				
			}
			res=Math.max(res, curr);
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {10,12,14,7,8};
		int[]array1= {7,10,13,14};
		System.out.println(maxEvenOdd(array1));
	}

}

