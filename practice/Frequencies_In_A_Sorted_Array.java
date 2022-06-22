package practice;

public class Frequencies_In_A_Sorted_Array {

	public static void Frequencies(int array[])
	{
		int count2=0;
		for(int i=0;i<array.length;i=i+count2)
		{

			int count=0;
		
			for(int j=0;j<array.length;j++)
			{
				
				if(array[i]==array[j])
				{
					count++;
					count2=count;
					
				}
				
			}
			System.out.println(array[i]+" "+count);

		}

	}
	public static void main(String[] args) {
		int array[]= {10,20,30};
		Frequencies(array);
	}
}
