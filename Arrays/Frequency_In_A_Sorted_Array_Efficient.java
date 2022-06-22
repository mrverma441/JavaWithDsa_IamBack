package Arrays;

public class Frequency_In_A_Sorted_Array_Efficient {

	public static void PrintFreq(int[]array)
	{
		int freq=1,i=1;
		int n=array.length;
		while(i<n)
		{
			while(i<n&&array[i]==array[i-1])
			{
				freq++;
				i++;
			}
			System.out.println(array[i-1]+" "+freq);
			i++;
			freq=1;
		}
		if(n==1||array[n-1]!=array[n-2])
		{
			System.out.println(array[n-1]+" "+1);
		}
	}
	public static void main(String[] args) {
		int []array= {10,10,10,25,30,30};
		PrintFreq(array);
	}
}
