package Matrix_;

public class Search_In_RowWise_And_ColumnWise_SortedMatrix {
	public static void search(int[][]matrix,int X,int R,int C)
	{
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				if(matrix[i][j]==X)
				{
					System.out.println("Found at "+i+","+j);
					return ;
				}
				
				
			}
		}
		System.out.println("Not found");
		
	}
	public static void main(String[]args)
	{
		int R=4;
		int C=4;
		int X=34;
		int[][]matrix= {{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
				
		};
		search(matrix, X, R, C);
	}

}
