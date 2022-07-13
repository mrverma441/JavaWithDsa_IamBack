package Arrays;

public class Minimum_Consecutive_Flips {
	public static void PrintGroups(int[]array)
	{
		int n=array.length;
		for(int i=1;i<n;i++)
		{
			if(array[i]!=array[i-1])
			{
				if(array[i]!=array[0])
				{
					System.out.print("from "+i+" to ");
				}
				else
				{
					System.out.print(i-1);
				}
			}
		}
		if(array[n-1]!=array[0])
		{
			System.out.print(n-1);
		}
	}
	public static void main(String[] args) {
		int[]array= {1,1,0,0,0,1};
		PrintGroups(array);
	}

}
