package practice;

public class Large {
	public static int L(int[]array)
	{
		int res=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>array[res])
			{
				res=i;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int []array= {3554,20,100,6,8,1000,3454,34,45,67,99};
		System.out.println(L(array));
	}

}
