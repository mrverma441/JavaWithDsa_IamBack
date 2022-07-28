package Matrix_;

public class Rotate_A_MatrixBy_90Degree {
	public static void rotate(int[][]array,int R,int C)
	{
		
		for(int i=C-1;i>=0;i--)
		{
			for(int j=0;j<R;j++)
			{
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args)
	{
		int R=4;
		int C=4;
		int[][]array= {{1,2,3},
			           {4,5,6},
			           {7,8,9},
			      };
		int[][]array2= {{1,2,3,4},
				        {5,6,7,8},
				        {9,10,11,12},
				        {13,14,15,16}};
		rotate(array2, R, C);
		
		
	}

}
