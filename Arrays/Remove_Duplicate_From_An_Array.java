package Arrays;

public class Remove_Duplicate_From_An_Array {

	public static int RemDup(int array[])
	{
	
		int temp[]=new int[array.length];
		temp[0]=array[0];
		int res=1;
		for(int i=1;i<array.length;i++)
		{
			if(temp[res-1]!=array[i])
			{
				temp[res]=array[i];
				res++;
			}
		}
		for(int i=0;i<res;i++)
		{
			array[i]=temp[i];
			
		}
		return res;
			
	}
	public static void main(String[] args) {
		int array[]= {10,20,20,30,30,30,30};
		System.out.println(RemDup(array));
	}
}
