package Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Median_Of_TwoSorted_Arrays {
	public static double calculateMedian(double[]array1,double[]array2)
	{
		int n1=array1.length;
		int n2=array2.length;
		double temp[]=new double[n1+n2];
		for(int i=0;i<n1;i++)
		{
			temp[i]=array1[i];
		}
		for(int i=0;i<n2;i++)
		{
			temp[n1]=array2[i];
			n1++;

		}
	
		n1=array1.length;
		int low=0;
		int high=temp.length-1;
		int mid=(low+high)/2;
		Arrays.sort(temp);
//		for(int i=0;i<temp.length;i++)
//		{
//			System.out.println(temp[i]+" ");
//		}
		if((n1+n2)%2==0)
		{
			return (temp[mid]+temp[mid+1])/2;
		}
		else
		{
			return temp[mid];
		}
	}
	public static void main(String[] args) {
		double[]array1= {10,20,30,40,50};
		double[]array2= {5,15,25,35,45};
		int[]array3= {1,2,3,4,5,6};
		int[]array4= {10,20,30,40,50};
		//calculateMedian(array1, array2);
		System.out.println(calculateMedian(array1, array2));
	}

}
