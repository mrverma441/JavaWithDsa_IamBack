package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	public static void bucketSort(int[]array,int k)
	{
		int n=array.length;
		int max_val=array[0];
		for(int i=1;i<n;i++)
		{
			max_val=Math.max(max_val, array[i]);
		}
		max_val++;
		ArrayList<ArrayList<Integer>>bkt=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<k;i++)
		{
			bkt.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++)
		{
			int bi=(k*array[i]/max_val);
			bkt.get(bi).add(array[i]);
		}
		for(int i=0;i<k;i++)
		{
			Collections.sort(bkt.get(i));
		}
		int index=0;
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<bkt.get(i).size();j++)
			{
				array[index++]=bkt.get(i).get(j);
			}
		}
	}
	public static void main(String[] args) {
		int[]array= {30,40,10,80,5,12,70};
		bucketSort(array, 4);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
