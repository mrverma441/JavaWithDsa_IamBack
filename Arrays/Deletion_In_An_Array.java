package Arrays;

public class Deletion_In_An_Array {

	public static int delete(int[]array,int n,int x)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(array[i]==x)
			{
				break;
			}
		}
		if(i==n)
		{
			return n;
		}
		for(int j=i;j<n-1;j++)
		{
			array[j]=array[j+1];
		}
		return n-1;
	}
	public static void main(String[] args) {
	       int arr[] = {3, 8, 12, 5, 6}, x = 12, n = 5;

	       

	       System.out.println("Before Deletion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();
	       

	       n = delete(arr, n, x);

	       System.out.println("After Deletion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }
	}
}
