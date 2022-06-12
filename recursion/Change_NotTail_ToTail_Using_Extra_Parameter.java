package recursion;

public class Change_NotTail_ToTail_Using_Extra_Parameter {

	public static void fun(int n,int k)
	{
		if(n==0)
		{
			return ;
			
		}
		System.out.println(k);
		fun(n-1,k+1);
	}
	public static void main(String[] args) {
		fun(6,1);
	}
}
