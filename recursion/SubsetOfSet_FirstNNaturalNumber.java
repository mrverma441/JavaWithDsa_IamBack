package recursion;

import java.util.ArrayList;

public class SubsetOfSet_FirstNNaturalNumber {
	public static void printsubset(ArrayList<Integer>subset)
	{
		for(int i=0;i<subset.size();i++)
		{
			System.out.print(subset.get(i)+" ");
		}
		System.out.println();
	}
	public static void findsubset(int n,ArrayList<Integer>subset)
	{
		if(n==0)
		{
			printsubset(subset);
			return;
		}
		//for add
		subset.add(n);
		findsubset(n-1,subset);
		//for not to be add
		subset.remove(subset.size()-1);
		findsubset(n-1,subset);

	}

	public static void main(String[] args) {
		int n=3;
		ArrayList<Integer>subset=new ArrayList<Integer>();
		findsubset(n,subset);
		
		

	}

}
