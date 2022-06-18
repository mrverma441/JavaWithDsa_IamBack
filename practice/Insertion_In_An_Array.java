package practice;

public class Insertion_In_An_Array {

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
		int array[]=new int[5];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		int n=3,cap=5;
		int x=40;
		int pos=3;
		System.out.println("Before Insertion ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int l=insert(array, n, x, cap, pos);

		System.out.println("After insertion");
		
		for(int i=0;i<l;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		
		
		
	}
}
