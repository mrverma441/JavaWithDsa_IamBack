package recursion;

public class Count_Total_Path_In_A_Maze {

	public static int Count_Paths(int i,int j,int n,int m)
	{
		
		if(i==n||j==m)
		{
			return 0;
		}
		if(i==n-1&&j==m-1)
		{
			return 1;
		}
		//move downwords
		int downpaths=Count_Paths(i+1, j, n, m);
		
		//move right
		int rightpath=Count_Paths(i, j+1, n, m);
		
		return downpaths+rightpath;
	}
	public static void main(String[] args) {
		System.out.println(Count_Paths(0, 0, 3, 3));
	}
	
}
