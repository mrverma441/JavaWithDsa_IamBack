package Sorting;

public class Intersection_Of_Two_Sorted_Arrays {
	public static void intersection(int[]a,int[]b)
	{
		int m=a.length;
		int n=b.length;
		for(int i=0;i<m;i++)
		{
			if(i>0&&a[i]==a[i-1])
			{
				continue;
			}
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {3,5,10,10,10,15,15,20};
		int[]b= {5,10,10,15,30};
		intersection(a, b);
		
	}

}
