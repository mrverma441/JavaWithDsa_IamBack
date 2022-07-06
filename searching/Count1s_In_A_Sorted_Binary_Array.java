package Searching;

public class Count1s_In_A_Sorted_Binary_Array {
	public static int count1s(int[]array)
	{
		int n=array.length;
		int i;
		for(i=0;i<n;i++)
		{
			if(array[i]==1)
			{
				break;
			}
		}
		return n-i;
	}
	public static void main(String[] args) {
		int[]array= {0,0,0,1,1,1,1};
		int[]array2= {1,1,1,1,1};
		int[]array3= {0,0,0,0};
		System.out.println(count1s(array3));
	}

}
