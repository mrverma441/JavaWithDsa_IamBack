package Arrays;

public class Insertion_In_An_array {

	public static int insert(int array[],int n,int x,int cap,int pos)
	{
		if(n==cap)
		{
			return n;
		}
		int index=pos-1;
		for(int i=n-1;i>=index;i--)
		{
			array[i+1]=array[i];
		}
		array[index]=x;
		return (n+1);
	}
	public static void main(String[] args) {
		int arr[] = new int[5], cap = 5, n = 3;

	       arr[0] = 5; arr[1] = 10; arr[2] = 20;

	       System.out.println("Before Insertion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       int x = 7, pos = 2;

	       int l= insert(arr, n, x, cap, pos);

	       System.out.println("After Insertion");

	       for(int i=0; i < l; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }		
	}
}
