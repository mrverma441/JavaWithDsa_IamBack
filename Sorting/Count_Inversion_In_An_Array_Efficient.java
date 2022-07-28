package Sorting;

public class Count_Inversion_In_An_Array_Efficient {
	public static int countAndMerge(int[]array,int low,int mid,int high)
	{
		int m=mid-low+1;
		int n=high-mid;
		int[]left=new int[m];
		int[]right=new int[n];
		for(int i=0;i<m;i++)
		{
			left[i]=array[i+low];
		}
		for(int j=0;j<n;j++)
		{
			right[j]=array[mid+j+1];
		}
		int i=0;
		int j=0;
		int k=low;
		int res=0;
		while(i<m&&j<n)
		{
			if(left[i]<=right[j])
			{
				array[k++]=left[i++];
				
			}
			else
			{
				array[k++]=right[j++];
				res=res+(m-i);
			}
		}
		while(i<m)
		{
			array[k++]=left[i++];

		}
		while(j<n)
		{
			array[k++]=right[j++];

		}
		return res;
		
	}
	public static int countInversion(int[]array,int l,int r)
	{
		int res=0;
		if(l<r)
		{
			int m=l+(r-l)/2;
			res+=countInversion(array, l, m);
			res+=countInversion(array, m+1, r);
			res+=countAndMerge(array, l, m, r);
		}
		return res;
	}

	public static void main(String[]args)
	{
		int[]a= {40,30,20,10};
		System.out.println(countInversion(a, 0, 3));
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
