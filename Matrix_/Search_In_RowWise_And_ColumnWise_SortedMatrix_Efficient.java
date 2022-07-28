package Matrix_;

public class Search_In_RowWise_And_ColumnWise_SortedMatrix_Efficient {
	public static void search(int[][]matrix,int X,int R,int C)
	{
		
		int i=0;
		int j=C-1;
		while(i<R&&j>=0)
		{
			if(matrix[i][j]==X)
			{
				System.out.print("Found at ("+i+","+j+")");
				return;
			}
			else if(matrix[i][j]>X)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		System.out.println("Not found");
		
		
	}
	public static void main(String[]args)
	{
		int R=4;
		int C=4;
		int X=20;
		int[][]matrix= {{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
				
		};
		search(matrix, X,R,C);
	}

}
