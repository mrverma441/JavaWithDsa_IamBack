package Arrays;

public class MoveToEnd {
	public static void Move(int []array)
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				int temp = array[i];
			  	array[i] = array[count];
			  	array[count] = temp;
			  	count++;
			  	
			}
		}
	}

}
