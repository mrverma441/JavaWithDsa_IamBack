package Arrays;

import java.util.Arrays;

public class FindSecondLargest_UsingSorting {

	public static void main(String[] args) {
		int array[]= {50,23,12,345,46};
		
		Arrays.sort(array);
		
		
		System.out.println("Second largest element in the array is "+array[array.length-2]);
	}
}
