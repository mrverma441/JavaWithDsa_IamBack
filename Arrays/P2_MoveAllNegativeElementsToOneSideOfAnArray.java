package Arrays;

public class P2_MoveAllNegativeElementsToOneSideOfAnArray {

	public static void Move(int[]array)
	{
		int j=0;
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			if(array[i]<0)
			{
				if(i!=j)
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				j++;
			}
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
		//int []array= {1,4,5,-3,-6,8,9,44,-4,6,90,88};
		int[]array= {1,2,-6,8};
		Move(array);
		PrintArray(array);
		
	}
}
