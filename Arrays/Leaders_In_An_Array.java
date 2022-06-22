package Arrays;

public class Leaders_In_An_Array {

	public static void Leaders(int array[])
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<n;j++)
			{
				if(array[i]<=array[j])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.print(array[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[]array= {7,10,4,3,6,5,2};
		Leaders(array);
	}
}
