package Arrays;

public class P8_Find_Transition_Point {
	public static int TransitionPoint(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			if(array[i]==1)
			{
				return i;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[]array= {0,0,0,1,1};
		System.out.println("Transition Point = "+TransitionPoint(array));
	}

}
