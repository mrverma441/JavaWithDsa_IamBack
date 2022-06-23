package practice;

public class Leaders_In_An_Array {
	public static void Leaders(int array[])
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<n;j++)
			{
				if(array[i]<=array[j])
				{
					flag=true;
					break;
				}

			}
			if(flag==false)
			{
				System.out.print(array[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int array[]= {7,10,4,5,6,5,2};
		Leaders(array);
	}

}
