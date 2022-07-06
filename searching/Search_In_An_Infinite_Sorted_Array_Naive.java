package Searching;

public class Search_In_An_Infinite_Sorted_Array_Naive {
	public static int search(int[]array,int x)
	{
		int i=0;
		while(true)
		{
			if(array[i]==x)
			{
				return i;
			}
			if(array[i]>x)
			{
				return -1;
			}
			i++;
		}
		
	}
	public static void main(String[] args) {
		int[]array= {1,10,15,20,40,80,90,100,120,500};
		System.out.println(search(array, 100));
	}

}
