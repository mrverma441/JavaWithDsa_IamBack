package Sorting;

public class KthSmallest_Efficient {
	public static int partition(int[]array,int l,int h)
	{
		int pivot=array[h];
		int i=l-1;
		for(int j=l;j<=h-1;j++)
		{
			if(array[j]<pivot)
			{
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[h];
		array[h]=temp;
		return (i+1);
	}
	public static int KthSmallest(int[]array,int k)
	{
		int n=array.length;
		int l=0;
		int r=n-1;
		while(l<=r)
		{
			int p=partition(array, l, r);
			if(p==k-1)
			{
				return p;
			}
			else if(p>k-1)
			{
				r=p-1;
			}
			else
			{
				l=p+1;
			}
		}
		return -1;
	}
	public static void main(String[]args)
	{
		int[]array= {10,5,30,12};
		int[]array2= {30,20,5,10,8};
		int k=4;
		System.out.println(KthSmallest(array2, k));
		
	}

}
