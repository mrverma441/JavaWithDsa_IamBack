package Hashing;

public class Intersection_Of_Two_Unsorted_Arrays {
	public static int countIntersection(int[]a,int[]b)
	{
		int m=a.length;
		int n=b.length;
		int res=0;
		for(int i=0;i<m;i++)
		{
			boolean flag=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==b[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				continue;
			}
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					res++;
					break;
				}
			}
		}
		return res;
	}
	public static void main(String[]args)
	{
		int[]a= {10,10,30,20};
		int[]b= {20,10,40,10,40,30};
		System.out.println(countIntersection(a, b));
	}

}
