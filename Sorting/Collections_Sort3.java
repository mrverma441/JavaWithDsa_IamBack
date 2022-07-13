package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point3
{
	int x,y;
	Point3(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
}
class MyCmp3 implements Comparator<Point3>
{

	@Override
	public int compare(Point3 o1, Point3 o2) {
		// TODO Auto-generated method stub
		return o1.x-o2.x;
	}
	
}
public class Collections_Sort3 {

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
