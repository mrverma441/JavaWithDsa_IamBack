package Searching;

public class count1s_In_A_Sorted_Array_Efficient {
	public static int count1s(int[]array)
	{
		int n=array.length;
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==0)
			{
				low=mid+1;
			}
			else
			{
				if(mid==0||array[mid-1]==0)
				{
					return (n-mid);
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return 0;

	}
	public static void main(String[] args) {
		int[]array= {0,0,0,1,1,1,1};
		int[]array2= {1,1,1,1,1};
		int[]array3= {0,0,0,0};
		System.out.println(count1s(array2));
	}

}
