package Sorting;

public class Merge_Function_Of_Merge_Sort {
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

	public static void main(String[] args) {
		int[]a= {10,15,20,11,30};
		merge(a, 0, 2, 4);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
