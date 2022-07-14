package Sorting;

public class Count_Inversion_In_An_Array {
	public static int countInversion(int[]array)
	{
		int n=array.length;
		int res=0;
		for(int i=0;i<(n-1);i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]>array[j])
				{
					res++;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {2,4,1,3,5};
		System.out.println(countInversion(array));
	}

}
