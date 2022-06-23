package practice;

public class Second_Largest {
	public static int Largest(int []array)
	{
		int largest=0;
		for(int i=0;i<array.length;i++)
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
		int res=-1;
		for(int i=0;i<array.length;i++)
		{
			
			if(array[i]!=array[largest])
			{
				if(res==-1)
				{
					res=i;
				}else if(array[i]>array[res])
				{
					res=i;
				}
			
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int []array= {10,10,10};
		System.out.println(SecondLargest(array));
	}

}
