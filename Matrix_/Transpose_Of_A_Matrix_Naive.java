package Matrix_;

public class Transpose_Of_A_Matrix_Naive {
	public static void transpose(int[][]array)
	{
		int n=array.length;
		int temp[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[j][i]=array[i][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=temp[i][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args)
	{
		int[][]array= {{1,2,3,4},
			       {5,6,7,8},
			       {9,10,11,12},
			       {13,14,15,16}};
		transpose(array);
	}

}
