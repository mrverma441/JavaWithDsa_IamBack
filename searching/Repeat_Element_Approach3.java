package Searching;

public class Repeat_Element_Approach3 {
	public static int repeatElement(int[]array)
	{
		int n=array.length;
		boolean[]visited=new boolean[n-1];
		for(int i=0;i<n;i++)
		{
			if(visited[array[i]])
			{
				return array[i];
			}
			visited[array[i]]=true;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]array= {0,2,1,3,2,2};
		int[]array2= {1,2,3,0,3,4,5};
		int[]array3= {0,0};
		System.out.println(repeatElement(array));
	}

}
