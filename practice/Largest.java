package practice;

public class Largest {
	public static int getL(int array[])
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			boolean flag=true;
			for(int j=0;j<n;j++)
			{
				if(array[j]>array[i])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int array[]= {10,20,30,40,100};
		System.out.println(getL(array));
	}

}
