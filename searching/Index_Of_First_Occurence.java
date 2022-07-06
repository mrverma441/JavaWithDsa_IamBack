package Searching;

public class Index_Of_First_Occurence {
	public static void firstOccurence(int[]array,int X)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			if(array[i]==X)
			{
				System.out.print(X+" is found at "+i+" index");
				break;
			
			}
			else if(i==n-1)
			{
				System.out.println(-1);
			}
		}
	
		
	}
	public static void main(String[] args) {
		int[]array= {1,10,10,10,20,20,40,50,60,70,70,70,70};
		int[]array2= {10,20,30};
		int[]array3= {15,15,15};
		firstOccurence(array,70);
	}

}
