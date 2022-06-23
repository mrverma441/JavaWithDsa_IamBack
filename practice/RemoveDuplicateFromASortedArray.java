package practice;

public class RemoveDuplicateFromASortedArray {

	public static int remD(int[]array)
	{
		int res=1;
		for(int i=1;i<array.length;i++)
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
		int array[]= {10,20,20,30,30,30,30};

		System.out.println(remD(array));
	}
}
