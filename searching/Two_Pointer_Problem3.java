package Searching;

public class Two_Pointer_Problem3 {
	public static  boolean isPair(int[]array,int left,int right,int x)
	{
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
	public static boolean isTriplet(int[]array,int x)
	{
		for(int i=0;i<array.length;i++)
		{
			if(isPair(array,i+1,array.length-1,x-array[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[]array= {2,3,4,8,9,20,40};
		System.out.println(isTriplet(array, 32));
	}

}
