package Arrays;

public class Majority_Element {
	public static int findMajority(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
			
			}
			if(count>n/2)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {8,3,4,8,8};
		int[]array1= {3,7,4,7,7,5};
		System.out.println(findMajority(array));
	}

}
