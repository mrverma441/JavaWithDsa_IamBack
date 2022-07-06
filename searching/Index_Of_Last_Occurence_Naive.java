package Searching;

public class Index_Of_Last_Occurence_Naive {
	public static int lastOccurence(int[]array,int x)
	{
		for(int i=array.length-1;i>=0;i--)
		{
			if(array[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {10,20,30,40,40,40};
		System.out.println(lastOccurence(array, 40));
	}

}
