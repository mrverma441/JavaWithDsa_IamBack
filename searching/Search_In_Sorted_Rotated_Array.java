package Searching;

public class Search_In_Sorted_Rotated_Array {
	
	public static int search(int[]array,int x)
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
		int[]array= {10,20,30,40,50,8,9};
		int[]array1= {100,200,300,10,20};
		System.out.println(search(array1,40));
	}

}
