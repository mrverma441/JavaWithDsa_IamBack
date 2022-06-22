package practice;

public class Delete {
	
	public static int DeleteE(int[]array,int n,int x)
	{
		int i;
		for( i=0;i<n;i++)
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
		int array[]= {3,8,12,5,6};
		int n=5;
		int x=12;
		System.out.println("Element in the array before deletion");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int d=DeleteE(array, n, x);
		System.out.println("Element in the array after deletion");

		for(int i=0;i<d;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	

}
