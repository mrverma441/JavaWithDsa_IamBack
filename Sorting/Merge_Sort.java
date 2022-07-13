package Sorting;

public class Merge_Sort {
	public static void merge(int[]a,int low,int mid,int high)
	{
		int n1=mid-low+1;
		int n2=high-mid;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			left[i]=a[i+low];
		}
		for(int j=0;j<n2;j++)
		{
			right[j]=a[mid+1+j];
		
		}
		int i=0,j=0,k=low;
		while(i<n1&&j<n2)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				k++;
				i++;
			}
			else
			{
				a[k]=right[j];

				k++;
				j++;
			}
		}
		while(i<n1)
		{
			a[k++]=left[i++];
		}
		while(j<n2)
		{
			a[k++]=right[j++];
		}
		
	}

	public static void mergeSort(int[]array,int l,int r)
	{
		if(r>l)
		{
			int m=l+(r-l)/2;
			mergeSort(array, l, m);
			mergeSort(array, m+1, r);
			merge(array, l, m, r);
		}
	}
	public static void main(String[] args) {
		int[]array= {10,5,30,15,7};
		mergeSort(array, 0, 4);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
