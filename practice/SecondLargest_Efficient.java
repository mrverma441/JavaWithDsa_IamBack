package practice;

public class SecondLargest_Efficient {
	public static int secLar(int[]array)
	{
		int n=array.length;
		int sl=-1,largest=0;
		for(int i=1;i<n;i++)
		{
			if(array[i]>array[largest])
			{
				sl=largest;
				largest=i;
			}
			else if(array[i]!=array[largest])
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
		System.out.println(secLar(array));
	}

}
