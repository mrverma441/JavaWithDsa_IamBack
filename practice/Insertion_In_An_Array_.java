package practice;

public class Insertion_In_An_Array_ {

	public static int Insert(int[]array,int n,int cap,int x,int pos)
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
		int array[]=new int[5];
		int n=3;
		int cap=5;
		array[0]=10;array[1]=30;array[2]=40;
		System.out.println("Array before insertion ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int x=20;
		int pos=2;
		int l=Insert(array, n, cap, x, pos);
		System.out.println("Array after insertion");
		for(int i=0;i<l;i++)
		{
			System.out.print(array[i]+" ");
		}
				
	}
}
