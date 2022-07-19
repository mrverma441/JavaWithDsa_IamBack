package Sorting;

public class CycleSort {
	public static void cycleSortDistinct(int[]array)
	{
		int n=array.length;
		for(int cs=0;cs<n-1;cs++)
		{
			int item=array[cs];
			int pos=cs;
			for(int i=cs+1;i<n;i++)
			{
				if(array[i]<item)
				{
					pos++;
				}
				
			}
			int temp=item;
			item=array[pos];
			array[pos]=temp;
			
			while(pos!=cs)
			{
				pos=cs;
				for(int i=cs+1;i<n;i++)
				{
					if(array[i]<item)
					{
						pos++;
					}
				}
				int temp1=item;
				item=array[pos];
				array[pos]=temp1;

				
			}
		}
	
	}
	public static void main(String[] args) {
		int[]array= {20,40,50,10,30};
		cycleSortDistinct(array);
		
		
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
