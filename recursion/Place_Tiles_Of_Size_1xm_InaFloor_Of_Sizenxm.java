package recursion;

public class Place_Tiles_Of_Size_1xm_InaFloor_Of_Sizenxm {

	public static int Place_Tiles(int n,int m)
	{
		if(n==m)
		{
			return 2;
		}
		if(n<m)
		{
			return 1;
		}
		//vertical Placement
		int vertical=Place_Tiles(n-m, m);
		
		
		//Horizontal Placement
		int horizontal=Place_Tiles(n-1, m);
		
		
		return vertical+horizontal;
		
	}
	public static void main(String[] args) {
		System.out.println(Place_Tiles(4, 2));
	}
}
