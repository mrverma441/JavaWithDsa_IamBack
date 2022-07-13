package Sorting;

public class Merge_Two_Sorted_Array_In_Efficient_Way {
	public static void merge(int[]a,int b[])
	{
		int m=a.length;
		int n=b.length;
		int i=0,j=0;
		while(i<m&&j<n)
		{
			if(a[i]<=b[j])
			{
				System.out.print(a[i]+" ");
				i++;
			}
			else
			{
				System.out.print(b[j]+" ");
				j++;
			}
			
		}
		while(i<m)
		{
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<n)
		{
			System.out.print(b[i]+" ");
			j++;
		}
	}
	public static void main(String[] args) {
		int[]a= {10,15,20};
		int[]b= {5,6,6,15};
		merge(a, b);
	}

}
