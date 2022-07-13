package Arrays;

public class P9_Count_Inversion_In_An_Array {
	public static int count_Inversion(int[]array)
	{
		int n=array.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]>array[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[]array= {3,2,1};
		int[]array1= {2,4,1,3,5};
		System.out.println(count_Inversion(array1));
	}

}
