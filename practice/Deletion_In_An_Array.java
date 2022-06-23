package practice;

public class Deletion_In_An_Array {

	public static int  Deletion(int[]array,int x)
	{
		int i;
		int n=array.length;
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
			array[j] = array[j+1];
		}
		return n-1;
	}
	public static void main(String[] args) {
		int[]array= {3,8,12,5,6};
		int l=Deletion(array, 12);
		for(int i=0;i<l;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
