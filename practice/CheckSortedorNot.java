package practice;

public class CheckSortedorNot {

	public static boolean isSorted(int[]array)
	{
		int n=array.length;
		for(int i=1;i<n;i++)
		{
			if(array[i]<array[i-1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[]array= {8,12,16};
		System.out.println(isSorted(array));
	}
}
