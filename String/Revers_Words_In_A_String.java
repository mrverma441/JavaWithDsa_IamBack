package String;

public class Revers_Words_In_A_String {
	public static void reverse(char Str[],int low,int high)
	{
		while(low<=high)
		{
			char temp=Str[low];
			Str[low]=Str[high];
			Str[high]=temp;
			low++;
			high--;
		}
	}
	public static void reverseWords(char[]Str,int n)
	{
		
		int Start=0;
		for(int end=0;end<n;end++)
		{
			if(Str[end]==' ')
			{
				reverse(Str, Start, end-1);
				Start=end+1;
			}
		}
	reverse(Str, Start, n-1);
	reverse(Str,0,n-1);
		
	}
	public static void main(String[]args)
	{
		String s = "Welcome to Gfg";int n=s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing words in the string:");
        reverseWords(str,n);
        System.out.println(str);  		
	}

}
