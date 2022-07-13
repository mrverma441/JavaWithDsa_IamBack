package Arrays;

public class P6_Count_Zeroes_In_An_Array {
	public static int CountZeroes(int[]array)
	{
		int n=array.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[]array= {10,20,30,0,0,0,60,0,0,0,0,70,0,90,87,0,45,0,90};
		System.out.println("Total Zeroes in array =:"+CountZeroes(array));
	}

}
