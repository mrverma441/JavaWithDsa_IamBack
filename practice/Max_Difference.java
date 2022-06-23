package practice;

public class Max_Difference {
	public static int Max_Diff(int[]array)
	{
		int n=array.length;
		int res=array[1]-array[0];
		int minVal=array[0];
		for(int j=1;j<n;j++)
		{
			res=Math.max(res, array[j]-minVal);
			minVal=Math.min(minVal, array[j]);
			
		}
		return res;
		
	}
	public static void main(String[] args) {
		int[]array= {2,3,10,6,4,8,1};
		System.out.println(Max_Diff(array));
	}

}
