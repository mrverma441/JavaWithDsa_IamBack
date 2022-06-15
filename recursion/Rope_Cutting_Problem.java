package recursion;

public class Rope_Cutting_Problem {

	public static int Max_Cuts(int n,int a,int b,int c)
	{
		if(n==0)
		{
			return 0;
		}
		if(n<=-1)
		{
			return -1;
		}
		int res = Math.max(Max_Cuts(n-a, a, b, c), 
		          Math.max(Max_Cuts(n-b, a, b, c), 
		          Max_Cuts(n-c, a, b, c)));
		if(res==-1)
		{
			return -1;
		}
		return res+1;
	}
	public static void main(String[] args) {
		System.out.println(Max_Cuts(23,11,9,12));
	}
}
