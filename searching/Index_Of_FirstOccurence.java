package Searching;

public class Index_Of_FirstOccurence {
	public static int firstOccurence(int[]array,int x)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==x)
			{
				return i;
			}
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		int[]array= {1,10,10,10,20,20,40,50,60,70,70,70,70};
		int[]array2= {10,20,30};
		int[]array3= {15,15,15};
		System.out.println(firstOccurence(array,70));
	}

}

