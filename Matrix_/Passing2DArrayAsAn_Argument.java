package Matrix_;

public class Passing2DArrayAsAn_Argument {
	public static void print(int[][]array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[][]array= {{1,2,3},
				       {4,5,6}};
		print(array);
	}

}
