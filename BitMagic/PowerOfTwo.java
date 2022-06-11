package BitMagic;
import java.util.Scanner;
public class PowerOfTwo {

	public static boolean Power_OfTwo(int n)
	{
		if(n==0)
		{
			return false;
			
		}
		while(n!=1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(Power_OfTwo(n));
	}
}
