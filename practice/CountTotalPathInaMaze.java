package practice;

public class CountTotalPathInaMaze {

	public static int count(int i,int j,int n,int m)
	{
		if(i==n||j==m)
		{
			return 0;
		}
		if(i==n-1&&j==m-1)
		{
			return 1;
		}
		
		
		//Move downwords
		int downpaths=count(i+1, j, n, m);
		
		//Move right
		int rightpath=count(i, j+1, n, m);
		return downpaths+rightpath;
		
	}
	public static void main(String[] args) {

		System.out.println(count(0, 0, 3,3));
	}
}
