package Searching;

public class Count_Occurence_In_A_Sorted_Array {
	public static int countOccurence(int[]array,int x)
	{
		int n=array.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==x)
			{
				count++;
			}

		}
		return count;
	}
	public static void main(String[] args) {
		int[]array1= {10,20,20,20,30,30};
		int[]array2= {10,10,10,10,10};
		int[]array3= {5,8,10};
		System.out.println(countOccurence(array3, 7));
	}

}
