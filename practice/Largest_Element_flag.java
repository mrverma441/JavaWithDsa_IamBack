package practice;

public class Largest_Element_flag {

	public static int Largest(int array[])
	{
		int i;
		for(i=0;i<array.length;i++)
		{
			boolean flag=true;
			for(int j=0;j<array.length;j++)
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
		System.out.println(Largest(array));
	}
}
