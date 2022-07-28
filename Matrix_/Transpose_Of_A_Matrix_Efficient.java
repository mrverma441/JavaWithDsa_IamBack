package Matrix_;

public class Transpose_Of_A_Matrix_Efficient {
	public static void transpose(int[][]array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
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
