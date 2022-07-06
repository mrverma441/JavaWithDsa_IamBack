package Searching;

public class Two_Pointer_Problem1 {
	public static boolean sumEqualtox(int[]array,int x)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==x)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[]array= {3,5,9,2,8,10,12};
		System.out.println(sumEqualtox(array, 17));
	}

}
