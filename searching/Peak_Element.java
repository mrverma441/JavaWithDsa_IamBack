package Searching;

public class Peak_Element {
	public static int getPeak(int[]array)
	{
		int n=array.length;
		if(n==1)
		{
			return array[0];
		}
		if(array[0]>=array[1])
		{
			return array[0];
		}
		if(array[n-1]>=array[n-2])
		{
			return array[n-1];
		}
		for(int i=1;i<n-1;i++)
		{
			if(array[i]>=array[i-1]&&array[i]>=array[i+1])
			{
				return array[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {5,10,20,15,7};
		int[]array1= {10,20,15,5,23,90,67};
		System.out.println(getPeak(array1));
	}

}
