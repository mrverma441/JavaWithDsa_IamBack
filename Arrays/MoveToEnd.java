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
	public static void main(String[] args) {
		int []array= {8,5,0,10,0,20};
	    Move(array);
	    for(int i=0;i<array.length;i++)
	    {
	    	System.out.print(array[i]+" ");
	    }
	}

}
