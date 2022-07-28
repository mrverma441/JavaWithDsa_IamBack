package Hashing;

public class Frequencies_Of_Array_Elements {
	public static void printFrequency(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			boolean flag=false;
			for(int j=0;j<i;j++)
			{
				if(array[i]==array[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				continue;
			}
			int freq=1;
			for(int j=i+1;j<n;j++)
			{
				if(array[i]==array[j])
				{
					freq++;
				}
			}
			System.out.println(array[i]+" "+freq);
		}
	}
	public static void main(String[]args)
	{
		int[]array= {10,12,10,15,10,20,12,12};
		printFrequency(array);
	}

}
