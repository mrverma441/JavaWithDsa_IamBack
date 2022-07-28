package Hashing;

public class CountDistinctElement_Naive {
	public static int countDistinct(int[]array)
	{
		int n=array.length;
		int res=0;
		for(int i=0;i<n;i++)
		{
			boolean flag=false;
			for(int j=0;j<i;j++)
			{
				if(array[i]==array[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				res++;
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		int[]array= {15,12,13,12,13,13,18};
		System.out.println(countDistinct(array));
		
	}

}
