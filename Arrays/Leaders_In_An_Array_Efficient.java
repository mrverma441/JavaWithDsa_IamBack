package Arrays;

public class Leaders_In_An_Array_Efficient {

	public static void Leaders(int[]array)
	{
		int n=array.length;
		int cur_Ldr=array[n-1];
		System.out.print(cur_Ldr+" ");
		for(int i=n-2;i>=0;i--)
		{
			if(cur_Ldr<array[i])
			{
				cur_Ldr=array[i];
				System.out.print(cur_Ldr+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[]array= {7,10,4,3,6,5,2};
		Leaders(array);
	}
}
