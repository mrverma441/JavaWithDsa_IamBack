package practice;

public class Leaders_InAn_Array {

	public static void Leaders(int array[])
	{
		int n=array.length;
		int cur_ldr=array[n-1];
		System.out.print(cur_ldr);
		for(int i=n-2;i>=0;i--)
		{
			if(cur_ldr<array[i])
			{
				cur_ldr=array[i];
				System.out.print(cur_ldr+" ");
			}
			
				
		}
	}
	public static void main(String[] args) {
		int array[]= {7,10,4,5,6,5,2};
		Leaders(array);
	}
}
