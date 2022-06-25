package practice;

public class Second_Largest__ {
	public static int Largest(int[]array)
	{
		int n=array.length;
		int largest=0;
		for(int i=1;i<n;i++)
		{
			if(array[i]>array[largest])
			{
				largest=i;
			}
		}
		return largest;
	}
	public static int SecondLargest(int[]array)
	{
		int largest=Largest(array);
		int n=array.length;
		int sl=-1;
		for(int i=0;i<n;i++)
		{
			if(array[i]!=array[largest])
			{
				if(sl==-1||array[i]>array[sl])
				{
					sl=i;
				}
				
			}
		}
		return sl;
	}
	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		System.out.println(SecondLargest(array));
		
	}

}
