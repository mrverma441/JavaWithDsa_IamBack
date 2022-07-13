package Sorting;

import java.util.Arrays;

class Point implements Comparable<Point>
{
	int x,y;
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}

	@Override
	public int compareTo(Point p) {
		return this.x-p.x;
	}
	
}
public class Sorting_An_Array_OF_Non_Primitive_Class_Implements_Comparable {
	public static void main(String[] args) {
		Point array[]= {new Point(10,20),new Point(3,12),new Point(5,7)};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i].x+" "+array[i]);
		}
	}
	

}
