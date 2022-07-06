package Searching;

public class Repeating_Element_approach4 {
	public static int findRepating(int[]array)
	{
		int n=array.length;
		int slow=array[0],fast=array[0];
		do
		{
			slow=array[slow];
			fast=array[array[fast]];
			
		}while(slow!=fast);
		
		
		slow=array[0];
		while(slow!=fast)
		{
			slow=array[slow];
			fast=array[fast];
		}
		return slow;
	}
	public static void main(String[] args) {
		int[]array= {2,1,3,2,2};
		int[]array2= {1,2,3,3,4,5};
		int[]array3= {0,0};
		System.out.println(findRepating(array2));
	}
	

}
