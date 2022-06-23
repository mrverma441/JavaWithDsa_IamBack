package practice;

public class Searching_In_An_Array {

	public static int  Search(int[]array,int x)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			if(array[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int array[]= {20,5,7,25};
		System.out.println(Search(array, 25));
	}
}
