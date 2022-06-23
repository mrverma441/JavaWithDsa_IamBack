package practice;

public class Largest_ {
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
		int[]array= {40,8,50,100};
		System.out.println(L(array));
	}

}
