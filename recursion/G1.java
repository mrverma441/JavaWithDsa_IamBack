package recursion;

public class G1 {

	public static void fun1()
	{
		System.out.println("Fun1");
	}
	public static void fun2()
	{
		System.out.println("Before fun1 ");
		fun1();
		System.out.println("After fun1");
	}
	public static void main(String[] args) {
		System.out.println("Before fun2");
		fun2();
		System.out.println("After fun2");
	}
}
