package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyCmp1 implements Comparator<Integer>
{

	
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a%2-b%2;
	}
	
}
public class Reverse_Using_Comparator {
	public static void main(String[] args) {
		Integer[]array= {5,20,10,3,12};
		Arrays.sort(array,new MyCmp1());
		System.out.println(Arrays.toString(array));
		
	}

}
