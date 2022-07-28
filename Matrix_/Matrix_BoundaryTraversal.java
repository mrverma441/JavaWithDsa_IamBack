package Matrix_;

public class Matrix_BoundaryTraversal {
	public static void boundaryTraversal(int[][]array,int R,int C)
	{
		if(R==1)
		{
			for(int i=0;i<C;i++)
			{
				System.out.print(array[0][i]+" ");
			}
		}
		else if(C==1)
		{
			for(int i=0;i<R;i++)
			{
				System.out.print(array[i][0]+" ");
			}
		}
		else
		{
			for(int i=0;i<C;i++)
			{
				System.out.print(array[0][i]+" ");
			}
			for(int i=1;i<R;i++)
			{
				System.out.print(array[i][C-1]+" ");
			}
			for(int i=C-2;i>=0;i--)
			{
				System.out.print(array[R-1][i]+" ");
			}
			for(int i=R-2;i>=1;i--)
			{
				System.out.print(array[i][0]+" ");
			}
		}
	}
	public static void main(String[]args)
	{
		int R=4,C=4;
		int[][]array= {{1,2,3,4},
				       {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}};
		boundaryTraversal(array, R, C);
		
	}

}
