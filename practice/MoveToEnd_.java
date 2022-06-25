package practice;

public class MoveToEnd_ {
	public static void Move(int[]array)
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
		int []array= {0,0,0,3,4,5,6,7,8,0,6,6,6,7,7,0,0};
		Move(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
