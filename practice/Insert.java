package practice;

public class Insert {
	public static int insertion(int array[],int n,int x,int cap,int pos)
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
		return n+1;
	}
	
	public static void main(String[] args) {
		
		int array[]=new int[5];
		int cap=5,n=3;
		array[0]=10;array[1]=30;array[2]=40;
		int pos=2;
		int x=20;
		System.out.println("Array before inserting the new element");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int l=insertion(array, n, x, cap, pos);
		System.out.println("Array after inserting the new element");
		for(int i=0;i<l;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		
	}

}
