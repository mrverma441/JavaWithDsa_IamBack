package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P3_Union_Of_Two_Arrays {

	public static void main(String[] args) {
		Integer[]array1= {1,2,3,4,5,6,7,8};
		System.out.println("Array1: "+Arrays.toString(array1));
		
		Integer[]array2= {2,4,6,8,10,12,14,16,18};
		System.out.println("Array2: "+Arrays.toString(array2));
		
		
		Set<Integer>set=new HashSet<Integer>();
		set.addAll(Arrays.asList(array1));
		set.addAll(Arrays.asList(array2));
		
		
		Integer[]unionarray= {};
		unionarray=set.toArray(unionarray);
		System.out.println("Union of two arrays "+Arrays.toString(unionarray));
		
	}
}
