
package practice;

public class Remove_Duplicate {
	public static int RD(int[]array)
	{
		int n=array.length;
		int res=1;
		for(int i=1;i<n;i++)
		{
			if(array[res-1]!=array[i])
			{
				array[res]=array[i];
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {10,20,20,30,30,30,30,40,40,40};
		System.out.println(RD(array));

	}

}
