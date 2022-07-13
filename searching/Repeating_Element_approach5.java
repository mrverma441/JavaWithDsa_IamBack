package Searching;

public class Repeating_Element_approach5 {
	public static int findRepating(int[]array)
	{
		int n=array.length;
		int slow=array[0]+1,fast=array[0]+1;
		do
		{
			slow=array[slow]+1;
			fast=array[array[fast]+1]+1;
			
		}while(slow!=fast);
		
		
		slow=array[0]+1;
		while(slow!=fast)
		{
			slow=array[slow]+1;
			fast=array[fast]+1;
		}
		return slow-1;
	}
	public static void main(String[] args) {
		int[]array= {0,2,1,3,2,2};
		int[]array2= {1,2,3,0,3,4,5};
		int[]array3= {0,0};
		System.out.println(findRepating(array));
		}
	

}
