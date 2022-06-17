package practice;

import java.util.ArrayList;

public class Subset_Of_First_N_Natural_Number {

	public static void FindSubset(int n,ArrayList<Integer>subset)
	{
		if(n==0)
		{
			PrintSubset(subset);
			return;
		}
		//for add
		subset.add(n);
		FindSubset(n-1, subset);
		//for not add
		subset.remove(subset.size()-1);
		FindSubset(n-1, subset);
	}

	private static void PrintSubset(ArrayList<Integer> subset) {
		
		for(int i=0;i<subset.size();i++)
		{
			System.out.print(subset.get(i)+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer>subset=new ArrayList<Integer>();
				
		FindSubset(3, subset);
	}
}
