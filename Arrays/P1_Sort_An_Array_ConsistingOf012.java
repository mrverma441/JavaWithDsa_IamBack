package Arrays;

public class P1_Sort_An_Array_ConsistingOf012 {

	public static void Sort012(int[]array)
	{
		int n=array.length;
		int count1=0,count2=0,count3=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				count1++;
			}
			else if(array[i]==1)
			{
				count2++;
			}
			else
			{
				count3++;
			}
				
		}
		for(int i=0;i<count1;i++)
		{
			array[i]=0;
		}
		for(int i=count1;i<count1+count2;i++)
		{
			array[i]=1;
		}
		for(int i=count1+count2;i<n;i++)
		{
			array[i]=2;
		}
		
	}
	public static void PrintArray(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[]array= {2,1,1,0,0,0,2,2,1,2,1,1,1,0};
		Sort012(array);
		PrintArray(array);
	}
}
