package practice;

public class Tower_Of_Hanoi {

	public static void TOH(String src,String helper,String dest,int n)
	{
		if(n==1)
		{
			System.out.println("Transfer "+n+" disk from "+src+" to "+dest);
			return;
		}
		TOH(src,dest,helper,n-1);
		System.out.println("Transfer "+n+" disk from "+src+" to "+dest);
		TOH(helper, src, dest, n-1);

		
	}
	public static void main(String[] args) {
		TOH("S", "H", "D", 2);
	}
}
