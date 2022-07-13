package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class CollectionsReverseORder {
	public static void main(String[] args) {
		Integer[]array= {5,20,10,12};
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}

}
