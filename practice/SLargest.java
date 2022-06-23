package practice;

public class SLargest {
	public static int SecLargest(int array[])
	{
		int n=array.length;
		int res=-1;
		int largest=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]>array[largest])
			{
				res=largest;
				largest=i;
			}else if(array[i]!=array[largest])
			{
				if(res==-1||array[i]>array[res])
				{
					res=i;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int []array= {10,5,8,20};
		System.out.println(SecLargest(array));

	}

}
