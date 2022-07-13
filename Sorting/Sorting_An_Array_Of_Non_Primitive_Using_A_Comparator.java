package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class Point1
{
    int x, y;
    Point1(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class MyCmp implements Comparator<Point1>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point1 p1, Point1 p2)
    {
        return p1.x - p2.x;
    }
}
public class Sorting_An_Array_Of_Non_Primitive_Using_A_Comparator {
	 public static void main(String[] args) 
	    { 
	        // Array of 3 objects
	        Point arr[] = {
	            new Point(10, 20), 
	            new Point(3, 12), 
	            new Point(5, 7) };
	            
	        // Sorting the object containing the array 
	        // by passing the array and object MyCmp
	        Arrays.sort(arr);
	        
	        // Displaying the sorted array
	        for(int i = 0; i < arr.length; i++)
	            System.out.println(
	                arr[i].x + " " + arr[i].y);
	    } 

}
