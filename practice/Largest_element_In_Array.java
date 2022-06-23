package practice;

public class Largest_element_In_Array {

	public static int Largest(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			boolean flag=true;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]<array[j])
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
		int []array= {40,8,50,100};
		System.out.println(Largest(array));
	}
}
