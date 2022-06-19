package Arrays;

public class Move_To_End {
	
	public static void Move(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
			{
				for(int j=i+1;j<array.length;j++)
				{
					if(array[j]!=0)
					{
						int temp = array[i];
					  	array[i] = array[j];
					  	array[j] = temp;
					}
				}
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
