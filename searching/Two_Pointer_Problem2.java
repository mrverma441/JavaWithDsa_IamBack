package Searching;

public class Two_Pointer_Problem2 {
	public static  boolean isPair(int[]array,int x)
	{
		int left=0;
		int right=array.length-1;
		while(left<right)
		{
			if(array[left]+array[right]==x)
			{
				return true;
			}
			else if(array[left]+array[right]>x)
			{
				right--;
			}
			else
			{
				left++;
			}
		}
		return false;
				
	}
	public static void main(String[] args) {
		int[]array= {3,5,9,2,8,10,12};
		System.out.println(isPair(array, 17));
	}

}
