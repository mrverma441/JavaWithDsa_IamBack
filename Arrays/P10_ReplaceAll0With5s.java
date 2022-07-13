package Arrays;

public class P10_ReplaceAll0With5s {
	public static int replace(int num)
	{
		String str=String.valueOf(num);
		String replace = str.replace('0', '5');
		return Integer.parseInt(replace);
	}
	public static void main(String[] args) {
		int num=102;
		System.out.println(replace(num));
		
		
	}

}
