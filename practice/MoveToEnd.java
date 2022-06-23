package practice;

public class MoveToEnd {
	public static void MoveToEnd(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
		
			if(array[i]==0)
			{
				for(int j=i+1;j<n;j++)
				{
					if(array[j]!=0)
					{
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int []array= {8,5,0,10,0,20};
		MoveToEnd(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	

}
