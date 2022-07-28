package Matrix_;

public class Snake_Pattern_Matrix {
	public static void snakePattern(int[][]array)
	{
		
		int r=4;
		int c=4;
		for(int i=0;i<r;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			else
			{
				for(int j=c-1;j>=0;j--)
				{
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[]args)
	{
		int[][]array= {{1,2,3,4},
		               {5,6,7,8},
		               {9,10,11,12},
		               {13,14,15,16}};
		snakePattern(array);
		
	}

}
