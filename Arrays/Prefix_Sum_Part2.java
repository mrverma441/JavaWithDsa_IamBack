package Arrays;

public class Prefix_Sum_Part2 {
	public static int maxOcc(int[]L,int[]R)
	{
		int n=L.length;
		int[]arr=new int[1000];
		for(int i=0;i<n;i++)
		{
			arr[L[i]]++;
			arr[R[i]+1]--;
		}
		int maxm=arr[0],res=0;
		for(int i=1;i<1000;i++)
		{
			arr[i]+=arr[i-1];
			if(maxm<arr[i])
			{
				maxm=arr[i];
				res=i;
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		int L[]= {1,2,5,15};
		int R[]= {5,8,7,18};
		System.out.println(maxOcc(L, R));
	}

}
