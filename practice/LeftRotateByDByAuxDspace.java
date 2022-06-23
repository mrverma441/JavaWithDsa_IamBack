package practice;

public class LeftRotateByDByAuxDspace {
	public static void RotateByd(int[]array,int d)
	{
		int n=array.length;
		int []temp=new int[array.length];
		for(int i=0;i<d;i++)
		{
			temp[i]=array[i];
		}
		for(int i=d;i<array.length;i++)
		{
			array[i-d]=array[i];
		}
		for(int i=0;i<d;i++)
		{
			array[n-d+i]=temp[i];
		}
	}
	public static void main(String[] args) {
		int []array= {1,2,3,4,5};
		RotateByd(array, 2);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
