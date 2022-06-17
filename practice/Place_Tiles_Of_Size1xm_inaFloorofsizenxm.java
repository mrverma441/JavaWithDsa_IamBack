package practice;

public class Place_Tiles_Of_Size1xm_inaFloorofsizenxm {

	public static int PlaceTiles(int n,int m)
	{
		
		if(n==m)
		{
			return 2;
		}
		if(n<m)
		{
			return 1;
		}
		//vertical placement
		int vertical=PlaceTiles(n-m, m);
		
		
		//horizontal placement
		int horizontal=PlaceTiles(n-1, m);
		
		return vertical+horizontal;
	}
	public static void main(String[] args) {
		System.out.println(PlaceTiles(4, 2));
	}
}

