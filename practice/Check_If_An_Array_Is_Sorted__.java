package practice;

public class Check_If_An_Array_Is_Sorted__ {
	public static boolean isSorted(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]>array[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[]array= {8,12,15,4};
		System.out.println(isSorted(array));
	}

}
