package practice;

public class Frequencies_InASorted_array_Efficient {

	public static void Frequencies(int[]array)
	{
	
		int count2=0;
		int count;
		int index=0;


		for(int i=0;i<array.length;i=i+count2)
		{
			count=0;
			
				while(array[i]==array[index])
				{
					
					count++;
					count2=count;
				    index++;
	

				}
				System.out.println(array[i]+" "+count);
		
			
		}
	
	}
	public static void main(String[] args) {
		int array[]= {10,10,10,25,30,30};
		//int array[]= {10,10,10,10};
		Frequencies(array);
	}
	
}
