package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point2 implements Comparable<Point2>
{

	int x,y;
	Point2(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point2 p) {
		// TODO Auto-generated method stub
		return this.x-p.x;
	}
	
}
public class Collections_Sort2 {
	public static void main(String[] args) {
		List<Point2>list=new ArrayList<Point2>();
		list.add(new Point2(5,10));
		list.add(new Point2(2,20));
		list.add(new Point2(10,30));
		Collections.sort(list);
		
		for(Point2 p:list)
		{
			System.out.println(p.x+" "+p.y);
		}
		
		
	}

}
