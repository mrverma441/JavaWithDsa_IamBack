package Searching;

public class Repeating_Element_approach5 {
	public static int findRepating(int[]array)
	{
	
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
		int[]array= {1,3,2,4,3,3};
		System.out.println(findRepating(array));
		}
	

}
