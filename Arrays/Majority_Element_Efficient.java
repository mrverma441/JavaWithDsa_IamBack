package Arrays;

public class Majority_Element_Efficient {
	public static int findMajority(int[]array)
	{
		int n=array.length;
		int res=0;
		int count=1;
		for(int i=1;i<n;i++)
		{
			if(array[res]==array[i])
			{
				count++;
			}
			else 
			{
				count--;
			}
			if(count==0)
			{
				res=i;
				count=1;
			}
		}
		count=0;
		for(int i=0;i<n;i++)
		{
			if(array[res]==array[i])
			{
				count++;
				
			}
		}
		if(count<=n/2)
		{
			res=-1;
		}
		return res;
	}
	public static void main(String[] args) {
		int[]array= {8,3,4,8,8};
		int[]array1= {3,7,4,7,7,5};
		System.out.println(findMajority(array));
	}

}
