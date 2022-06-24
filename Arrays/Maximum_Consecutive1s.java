package Arrays;

public class Maximum_Consecutive1s {

	public static int maxConsecutive1s(int array[])
	{
		int res = 0;

		int n=array.length;
    	for(int i = 0; i < n; i++)
    	{
    		int curr = 0;

    		for(int j = i; j < n; j++)
    		{
    			if(array[j] == 1) curr++;
    			else break;
    		}

    		res = Math.max(res, curr);
    	}
    	
    	return res;

	}
	public static void main(String[] args) {
		int[]array= {0,1,1,0,1,0};
		System.out.println(maxConsecutive1s(array));
	}
}
