package Arrays;

public class Frequency_In_A_Sorted_Array_Efficient2 {
	public static void Frequency(int[]array)
	{
		int n=array.length;
		int count;
		int count2=0;
		int index=0;
		for(int i=0;i<n;i=i+count2)
		{
			count=0;
			while((index<array.length)&&array[i]==array[index])
			{
				count++;
				count2=count;
				index++;
			}
			System.out.println(array[i]+" "+count);
		}
	}
	public static void main(String[] args) {
		int []array= {10,10,10,25,30,30};

		Frequency(array);
	}

}
